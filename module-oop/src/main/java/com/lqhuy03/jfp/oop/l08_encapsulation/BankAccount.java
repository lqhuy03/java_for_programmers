package com.lqhuy03.jfp.oop.l08_encapsulation;

public class BankAccount {
    private double balance; // field private - ẩn bên ngoài

    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter với validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
