# Java Object-Oriented Programming Coursework

Portfolio archive for an Object-Oriented Programming course in Java, completed in Spring 2024.

Course context found in the included documents:

- Course: `COSC 1437`
- Institution: Alamo Colleges
- Campus: not identified in the available source files or documents
- Term: Spring 2024

This repository keeps the coursework source close to its original assignment form while organizing it for public review. The original folder included duplicate ZIP submissions, corrected resubmissions, screenshots, and reports; the tracked repository focuses on readable source snapshots, relevant screenshots, and supporting documents.

## Highlights

- Object-oriented Java classes, constructors, setters/getters, validation, and driver programs
- Composition across employee, address, benefit, parking permit, and video game examples
- Arrays, `ArrayList`, search, sorting, and formatted output
- Inheritance and polymorphism with ships, animals, and employee pay examples
- A state-pattern lab using a shared `TravelMode` interface
- Debugging reflection and short technical reports from the course

## Repository Layout

```text
assignments/
  module-01-basics/
  module-02-classes/
  module-02-debugging/
  module-03-composition/
  module-04-arrays-and-collections/
  module-05-inheritance-and-polymorphism/
  module-08-patterns/
docs/
  reports/
  reflections/
scripts/
  compile-assignments.ps1
```

The source is organized by assignment rather than as one application. Several labs reuse package names or class names, so the validation script compiles each assignment independently.

## Compile Check

Requirements:

- JDK 14 or newer
- PowerShell

Run:

```powershell
.\scripts\compile-assignments.ps1
```

The script selects the newest `javac` available on the machine because one assignment uses modern arrow-style `switch` cases. Compiled `.class` files are written under `build/`, which is intentionally ignored by Git.

## Notes

The original ZIP bundles and duplicate staging files are kept out of the published repository to avoid redundant binary artifacts. Screenshots and documents are included where they help show submitted output or course reflection.

This is an educational portfolio archive. Some files reflect assignment starter code or course-provided scaffolding alongside my submitted work.
