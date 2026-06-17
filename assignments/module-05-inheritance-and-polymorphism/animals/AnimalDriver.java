// Programmer: Devin Thomas
// Date: Apr 7, 2024
// Module 5, CLO
// Purpose: This program is designed to demonstrate overriding methods in a class,
// including toString, hashCode and a made up method makeSound

package com.cosc.module5;

import java.util.ArrayList;
import java.util.Objects;

class Animal {
    private String name;

    public Animal(String name) { this.name = name; }

    public String getName() { return name; }

    // by creating a soundString function and overriding that,
    // we can override fewer methods per derived class
    protected String soundString() { return "some generic animal sound"; }

    // makeSound(), toString() and hashCode() do not require overrides
    // due to how they are implemented here
    public void makeSound() { System.out.println(soundString()); }

    @Override
    public String toString() { return this.name + " says " + this.soundString(); }

    @Override
    public int hashCode() { return Objects.hash(getName(), getClass()); }

}

class Dog extends Animal {
    public Dog(String name) { super(name); }

    // by overriding soundString() we have effectively implemented
    // makeSound() and toString() as well
    @Override
    protected String soundString() { return "Woof Woof"; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Dog comparisonDog = (Dog) obj;
        return this.getName().equals(comparisonDog.getName());
    }
}

class Cat extends Animal {
    public Cat(String name) { super(name); }

    // by overriding soundString() we have effectively implemented
    // makeSound() and toString() as well
    @Override
    protected String soundString() { return "Meow Meow"; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Cat comparisonCat = (Cat) obj;
        return this.getName().equals(comparisonCat.getName());
    }
}

public class AnimalDriver {
    public static void main(String[] args) {
        // Create Dog instances
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Scrappy-Doo");

        // Output hash code of each Dog
        System.out.println("Dog1 hash: " + dog1.hashCode());
        System.out.println("Dog2 hash: " + dog2.hashCode());

        // Check if Dog objects are identical
        System.out.println("Are dogs identical? " + dog1.equals(dog2));
        System.out.println();

        // Create Cat instances
        Cat cat1 = new Cat("Buddy");
        Cat cat2 = new Cat("Puss in Boots");

        // Output hash code of each Cat
        System.out.println("Cat1 hash: " + cat1.hashCode());
        System.out.println("Cat2 hash: " + cat2.hashCode());

        // Check if Cat objects are identical
        System.out.println("Are cats identical? " + cat1.equals(cat2));
        System.out.println();

        System.out.println("Is cat Buddy identical to dog Buddy? " + cat1.equals(dog1));
        System.out.println();

        // ArrayList for Dogs
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);

        // ArrayList for Cats
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);

        // Loop through ArrayLists and implicitly call toString using println
        for (Dog dog: dogs) System.out.println(dog);

        for (Cat cat: cats) System.out.println(cat);

    }
}

