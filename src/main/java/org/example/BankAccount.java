package org.example;

public class BankAccount {
    protected double balance;
    protected double minBalance;
    private String accountHolderName;

    public double getBalance() {
        return balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public BankAccount(double balance, double minBalance, String accountHolderName) {
        if (balance < minBalance) {
            throw new IllegalArgumentException("The balance is too low");
        }
        this.balance = balance;
        this.minBalance = minBalance;
        this.accountHolderName = accountHolderName;
    }

    public void withdraw(double amount) throws Exception {
        if ((this.balance - amount) < this.minBalance) {
            this.balance -= amount;
            System.out.println("The amount is: " + amount);
        } else {
            throw new Exception("The withdrawal amount is too high");
        }
    }

    public void deposit(double amount) throws Exception {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("The new balance is: " + this.balance);
        } else {
            throw new Exception("The amount is less than 1");
        }
    }

    public String toString() {
        return "Balance: '" + this.balance + "'Min balance : '" + this.minBalance + "', Account Holder Name : '" + this.accountHolderName;
    }
}
