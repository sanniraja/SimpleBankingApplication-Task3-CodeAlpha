package com.simplebankingapplication;

import java.util.Scanner;

public class SimpleBankingApplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        // Add some dummy accounts for testing
        bank.addAccount(new Account(101, "Raju Kr", 10000));
        bank.addAccount(new Account(102, "Ashish Raj", 7500));

        int choice;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accNumber = scanner.nextInt();
                    Account acc1 = bank.findAccount(accNumber);
                    if (acc1 != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        acc1.deposit(depositAmount);
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accNumber = scanner.nextInt();
                    Account acc2 = bank.findAccount(accNumber);
                    if (acc2 != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        if (acc2.withdraw(withdrawalAmount)) {
                            System.out.println("Withdrawal successful.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accNumber = scanner.nextInt();
                    Account acc3 = bank.findAccount(accNumber);
                    if (acc3 != null) {
                        System.out.println("Balance: " + acc3.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

