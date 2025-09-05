package com.lqhuy03.jfp.oop.l20_abstrac_classes_methods;

abstract class Animal {
    public abstract void makeSound();
    public void move() {
        System.out.println(getClass().getSimpleName() + " is moving");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof...");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow...");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Woof Woof...
        dog.move();      // Dog is moving

        cat.makeSound(); // Meow Meow...
        cat.move();      // Cat is moving
    }
}
