package com.lqhuy03.jfp.basics.l11_if_statements;

public class Thermometer {
    public static void main(String[] args) {
        int temperature = -5;

        if (temperature < 0) {
            System.out.println("It's very, very cold!");
        } else if (temperature >= 0) {
            System.out.println("It's not so cold.");
        }
    }
}
