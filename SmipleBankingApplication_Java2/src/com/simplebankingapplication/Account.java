package com.simplebankingapplication;

class Account {
    private int accNumber;
    private String accHolderName;
    private double balance;

    public Account(int accNumber, String accHolderName, double balance) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance =balance + amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }
}
