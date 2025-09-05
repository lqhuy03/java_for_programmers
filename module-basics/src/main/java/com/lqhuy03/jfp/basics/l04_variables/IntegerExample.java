package com.lqhuy03.jfp.basics.l04_variables;

public class IntegerExample {
    public static void main(String[] args) {
        // Khai báo biến
        int meaningOfLife;

        // Gán giá trị
        meaningOfLife = 42;

        // In giá trị
        System.out.println("Meaning of life is: " + meaningOfLife);

        // Khai báo và gán cùng lúc
        int x = 5;
        System.out.println("x = " + x);

        // Lỗi compile nếu gán sai kiểu:
        // int wrongType = 3.14; // ❌
    }
}
