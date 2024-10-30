package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1700, 1500, "John Smith");
        BankAccount acc2 = new BankAccount(1500, 1000, "Jane Doe");
        CurrentAccount cacc1 = new CurrentAccount(1200, 1000, "Dwayne Johnson", 2000);
        CurrentAccount cacc2 = new CurrentAccount(1300, 1100, "Leonardo DiCaprio", 2100);
        SavingsAccount sacc1 = new SavingsAccount(1000, 900, "Kamal Sacranie", 3.3);
        SavingsAccount sacc2 = new SavingsAccount(1300, 950, "Aster Shear", 2.9);

        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(cacc1);
        accounts.add(cacc2);
        accounts.add(sacc1);
        accounts.add(sacc2);

        for (BankAccount acc : accounts){
            System.out.println(acc);
        }

    }
}