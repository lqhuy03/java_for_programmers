package com.lqhuy03.jfp.oop.l03_access_modifiers;

public class Main{
    public static void main(String args[]) {
        Cop c = new Cop();
        // c.gun = 5; // This line would cause an error because 'gun' is private
        c.getGun(); // This is fine, we can access the private variable through a public method
        System.out.println("Gun: " + c.getGun()); // Output the value of gun
        // c.gun = 10; // This line would cause an error because 'gun' is private
    }
}

