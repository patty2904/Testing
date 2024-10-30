package org.example;

public class SavingsAccount extends BankAccount {
    public double interestRate;

    public SavingsAccount(double balance, double minBalance, String accountHolderName, double interestRate) {
        super(balance, minBalance, accountHolderName);
        this.interestRate = interestRate;
    }

    public void calculateInterest(){
        super.balance *= (1 + this.interestRate);
    }
}
