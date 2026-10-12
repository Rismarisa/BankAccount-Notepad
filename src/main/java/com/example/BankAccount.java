
package com.example;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Saldo awal tidak boleh negatif");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Jumlah setor harus lebih dari nol");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Jumlah penarikan harus lebih dari nol");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Saldo tidak mencukupi");
        }
        balance -= amount;
    }
}
