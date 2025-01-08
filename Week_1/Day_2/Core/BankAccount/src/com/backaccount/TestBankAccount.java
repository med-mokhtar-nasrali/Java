package com.backaccount;

public class TestBankAccount {

    public static void main(String[] args) {
        // create bank user instances
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();
        BankAccount user3 = new BankAccount();

        // deposit test
        user1.deposit("Check", 800);
        user1.deposit("Check", 500);
        user1.deposit("Savings", 300);
        user2.deposit("Check", 150);
        user3.deposit("Savings", 10);
        user3.deposit("Savings", 600);

        // balances after deposit
        user1.getBalance();
        user2.getBalance();
        user3.getBalance();

        // withdraw test
        user1.withdraw("Check", 1200);
        user1.withdraw("Check", 50);
        user1.withdraw("Check", 200);
        user2.withdraw("Savings", 780);
        user2.withdraw("Savings", 180);

        // balances after withdraw
        user1.getBalance();
        user2.getBalance();
        user3.getBalance();

        // method test
        System.out.println("Total Accounts: " + BankAccount.getAccounts());
        System.out.println("Total Money in Bank: $" + BankAccount.getTotalMoney());
    }
}
