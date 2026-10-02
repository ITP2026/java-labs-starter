package edu.course.lab02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankAccountTest {
    @Test
    void withdrawReducesBalance() {
        BankAccount account = new BankAccount(100);

        account.withdraw(30);

        assertEquals(70, account.getBalance());
    }

    @Test
    void withdrawMoreThanBalanceThrowsException() {
        BankAccount account = new BankAccount(100);

        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(150)
        );
    }

    @Test
    void depositIncreasesBalance() {
        BankAccount account = new BankAccount(100);

        account.deposit(50);

        assertEquals(150, account.getBalance());
    }

    @Test
    void negativeInitialBalanceThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new BankAccount(-1)
        );
    }

    @Test
    void nonPositiveDepositThrowsException() {
        BankAccount account = new BankAccount(100);

        assertThrows(
                IllegalArgumentException.class,
                () -> account.deposit(0)
        );
    }

    @Test
    void nonPositiveWithdrawThrowsException() {
        BankAccount account = new BankAccount(100);

        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(0)
        );
    }
}