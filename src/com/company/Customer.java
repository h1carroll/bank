package com.company;

import java.util.ArrayList;

public class Customer {
    private int customerID;
    private String name;
    private ArrayList<BankAccount> accounts;

    public Customer(String customerName, int taxID){
        customerID = taxID;
        name = customerName;
    }
    public boolean openAccount(double initialDeposit){
        var newAccount = new BankAccount();
        newAccount.deposit(initialDeposit);
        var didSucceed = accounts.add(newAccount);
        return didSucceed;
    }

    public int getCustomerID() {
        return customerID;
    }
    public String getName() {
        return name;
    }
}
