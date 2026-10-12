
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    public void testSaldoAwal() {
        BankAccount account = new BankAccount(100000);
        assertEquals(100000, account.getBalance());
    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100000);
        account.deposit(50000);
        assertEquals(150000, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(100000);
        account.withdraw(30000);
        assertEquals(70000, account.getBalance());
    }

    @Test
    public void testSaldoAwalNegatif() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(-1000);
        });
    }

    @Test
    public void testDepositNol() {
        BankAccount account = new BankAccount(100000);
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(0);
        });
    }

    @Test
    public void testWithdrawNegatif() {
        BankAccount account = new BankAccount(100000);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-10000);
        });
    }

    @Test
    public void testSaldoTidakCukup() {
        BankAccount account = new BankAccount(50000);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(100000);
        });
    }
}
