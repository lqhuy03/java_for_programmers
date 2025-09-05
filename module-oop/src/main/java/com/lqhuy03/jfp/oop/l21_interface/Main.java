package com.lqhuy03.jfp.oop.l21_interface;

// Base class
class Bird {
    public void eat() {
        System.out.println(getClass().getSimpleName() + " is eating!");
    }
}

// Interface
interface CanFly {
    void flying(); // mặc định public abstract
}

// Class vừa kế thừa vừa implements
class Parrot extends Bird implements CanFly {
    @Override
    public void flying() {
        System.out.println("Parrot is flying!");
    }
}

// Class không implements CanFly
class Penguin extends Bird {
    public void walk() {
        System.out.println("Penguin is walking!");
    }
}

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Penguin penguin = new Penguin();

        parrot.eat();    // Parrot is eating!
        parrot.flying(); // Parrot is flying!

        System.out.println();

        penguin.eat();   // Penguin is eating!
        penguin.walk();  // Penguin is walking!
    }
}
