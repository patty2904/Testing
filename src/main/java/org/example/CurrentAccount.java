package org.example;

public class CurrentAccount extends BankAccount {

    public double maxWithdrawalAmount;
    public CurrentAccount(double balance, double minBalance, String accountHolderName, double maxWithdrawalAmount) {
        super(balance, minBalance, accountHolderName);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= this.maxWithdrawalAmount){
                if ((this.balance - amount) < super.minBalance) {
                    this.balance -= amount;
                    System.out.println("The amount is: " + amount);
                } else {
                    throw new Exception("The withdrawal amount is too high");
                }
            } else {
            throw new IllegalArgumentException("The requested withdrawal amount is too high.");
        }
        }

    }

