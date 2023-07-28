//7. WAP to show inheritance in java.
import java.lang.*;
import java.util.Scanner;
// superclass
class Animal {
    protected String species;
    protected int age;

     Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

     void makeSound() {
        System.out.println("The " + species + " makes a sound.");
    }

     void move() {
        System.out.println("The " + species + " moves.");
    }
}
class Dog extends Animal {
    String name;

     Dog(String name, String species, int age) {
        super(species, age);
        this.name = name;
    }

     void makeSound() {
        System.out.println(name + " barks.");
    }
     void move() {
        System.out.println(name+" moves.");
    }
}

 class InheritanceDemo {
    public  static void main(String[] args) {
        Animal animal = new Animal("lion", 5);
        animal.makeSound(); // prints "The lion makes a sound."
        animal.move(); // prints "The lion moves."

        Dog dog = new Dog("Buddy", "dog", 3);
        dog.makeSound(); // prints "Buddy barks."
        dog.move(); // prints "The dog moves."
    }
}
