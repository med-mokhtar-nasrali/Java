package com.backaccount;

public class TestBankAccount {

	public static void main(String[] args) {
        //Create bank accounts instances
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();
        BankAccount user3 = new BankAccount();

        //Deposit Test
        user1.deposit("Check", 800);
        user1.deposit("Check", 500);
        user1.deposit("Savings", 300);
        user2.deposit("Check", 150);
        user3.deposit("Savings", 10);
        user3.deposit("Savings", 600);

        //Display balances after deposits
        user1.getBalance();
        user2.getBalance();
        user3.getBalance();

        //Withdrawal Test
        user1.withdraw("Check", 1200);
        user1.withdraw("Check", 50);
        user1.withdraw("Check", 200);
        user2.withdraw("Savings", 780);
        user2.withdraw("Savings", 180);

        //Display balances after withdrawals
        user1.getBalance();
        user2.getBalance();
        user3.getBalance();

        //Static method test
        System.out.println("Total Accounts: " + BankAccount.getAccounts());
        System.out.println("Total Money in Bank: $" + BankAccount.getTotalMoney());
    }
}
