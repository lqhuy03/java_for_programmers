package com.lqhuy03.jfp.basics.l08_stringchar;

public class StringCharExample {
    public static void main(String[] args) {
        // String literal
        String magicWord = "XYZZY";
        System.out.println("Original: " + magicWord);

        // Non-static method
        System.out.println("Uppercase: " + magicWord.toUpperCase());

        // Static method
        String numberStr = String.valueOf(12345);
        System.out.println("String from int: " + numberStr);

        // charAt
        char firstChar = magicWord.charAt(0);
        System.out.println("First char: " + firstChar);

        // char addition (Unicode sum)
        char c1 = 'Z', c2 = 'X';
        System.out.println("Unicode sum: " + (c1 + c2));

        // char concatenation with String
        System.out.println("Concatenate: " + c1 + c2);

        // Immutable example
        String upper = magicWord.toUpperCase();
        System.out.println("magicWord after toUpperCase(): " + magicWord); // không đổi
        System.out.println("Returned value: " + upper);
    }
}
