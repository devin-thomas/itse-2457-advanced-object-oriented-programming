param(
    [string]$JavacPath
)

$ErrorActionPreference = "Stop"

$repoRoot = Split-Path -Parent $PSScriptRoot
$buildRoot = Join-Path $repoRoot "build"

if (-not $JavacPath) {
    $javacCommand = Get-Command javac -All |
        Sort-Object -Property Version -Descending |
        Select-Object -First 1

    if (-not $javacCommand) {
        throw "javac was not found. Install JDK 14 or newer and rerun this script."
    }

    $JavacPath = $javacCommand.Source
}

Write-Host "Using javac: $JavacPath"

$assignments = @(
    @{ Name = "module-01-rng"; Path = "assignments/module-01-basics/random-number-generator" },
    @{ Name = "module-01-mpg"; Path = "assignments/module-01-basics/miles-per-gallon" },
    @{ Name = "module-02-sport"; Path = "assignments/module-02-classes/sport" },
    @{ Name = "module-02-car"; Path = "assignments/module-02-classes/car" },
    @{ Name = "module-02-average-calculator"; Path = "assignments/module-02-debugging/average-calculator" },
    @{ Name = "module-03-employee"; Path = "assignments/module-03-composition/employee" },
    @{
        Name = "module-03-parking-permit"
        Path = "assignments/module-03-composition/parking-permit"
        ExtraSources = @("assignments/module-03-composition/employee/Address.java")
    },
    @{ Name = "module-03-video-game"; Path = "assignments/module-03-composition/video-game" },
    @{ Name = "module-04-contacts"; Path = "assignments/module-04-arrays-and-collections/contacts" },
    @{ Name = "module-04-car-lot"; Path = "assignments/module-04-arrays-and-collections/car-lot" },
    @{ Name = "module-04-vgms"; Path = "assignments/module-04-arrays-and-collections/video-game-management-system" },
    @{ Name = "module-05-animals"; Path = "assignments/module-05-inheritance-and-polymorphism/animals" },
    @{ Name = "module-05-ships"; Path = "assignments/module-05-inheritance-and-polymorphism/ships" },
    @{ Name = "module-05-employee-inheritance"; Path = "assignments/module-05-inheritance-and-polymorphism/employee-inheritance" },
    @{ Name = "module-08-state-pattern"; Path = "assignments/module-08-patterns/state-pattern" }
)

New-Item -ItemType Directory -Path $buildRoot -Force | Out-Null

foreach ($assignment in $assignments) {
    $sourceDir = Join-Path $repoRoot $assignment.Path
    $sources = @(Get-ChildItem -Path $sourceDir -Filter "*.java" -File -Recurse)

    if ($assignment.ContainsKey("ExtraSources")) {
        foreach ($extraSource in $assignment.ExtraSources) {
            $sources += Get-Item -Path (Join-Path $repoRoot $extraSource)
        }
    }

    if ($sources.Count -eq 0) {
        Write-Warning "No Java files found for $($assignment.Name)"
        continue
    }

    $outDir = Join-Path $buildRoot $assignment.Name
    New-Item -ItemType Directory -Path $outDir -Force | Out-Null

    & $JavacPath -d $outDir @($sources.FullName)
    if ($LASTEXITCODE -ne 0) {
        throw "Compilation failed for $($assignment.Name)"
    }

    Write-Host "Compiled $($assignment.Name)"
}

Write-Host "All assignment snapshots compiled successfully."
