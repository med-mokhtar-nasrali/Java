package com.backaccount;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;

    private static int accounts = 0;
    private static double totalMoney = 0;

    // CONSTRUCTOR
    public BankAccount() {
        accounts++;
        this.accountNumber = generateAccounts();
    }

    // GETTERS
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    // deposit methods
    public void deposit(String accountType, double amount) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalMoney += amount;
    }

    // Withdraw method
    public void withdraw(String accountType, double amount) {
        if (accountType.equalsIgnoreCase("checking") && checkingBalance >= amount) {
            checkingBalance -= amount;
            totalMoney -= amount;
        } else if (accountType.equalsIgnoreCase("savings") && savingsBalance >= amount) {
            savingsBalance -= amount;
            totalMoney -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    // balance method
    public void getBalance() {
        double totalBalance = checkingBalance + savingsBalance;
        System.out.println("Account ID: " + accountNumber);
        System.out.println("Check Balance: $" + checkingBalance);
        System.out.println("Savings Balance: $" + savingsBalance);
        System.out.println("Total Balance: $" + totalBalance);
    }

    // Method to generate Id
    private String generateAccounts() {
        return String.valueOf((long) (Math.random() * 100000L));
    }
}