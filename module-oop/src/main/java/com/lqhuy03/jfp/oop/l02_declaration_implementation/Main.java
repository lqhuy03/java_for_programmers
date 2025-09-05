package com.lqhuy03.jfp.oop.l02_declaration_implementation;

// Sử dụng trong main()
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // tạo object
        myCar.topSpeed = 200;  // gán giá trị cho field
        myCar.drive();         // gọi method
    }
}
