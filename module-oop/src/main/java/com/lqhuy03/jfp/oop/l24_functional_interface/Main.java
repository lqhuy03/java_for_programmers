package com.lqhuy03.jfp.oop.l24_functional_interface;

@FunctionalInterface
interface Functional {
    void doSomething(); // ✅ Abstract method duy nhất

    default void foo() { // Có thể thêm default method
        System.out.println("foo");
    }
}

class Main {
    public static void main(String[] args) {
        // Dùng Lambda Expression
        Functional f = () -> System.out.println("Doing something...");
        f.doSomething(); // In ra: Doing something...
        f.foo();         // In ra: foo
    }
}
