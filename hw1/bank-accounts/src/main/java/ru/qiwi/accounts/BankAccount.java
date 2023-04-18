package ru.qiwi.accounts;

public class BankAccount {
    private double balance;
    private double commission = 0;
    private byte commissionRate = 0;

    protected BankAccount(double balance, double commission) {
        this.balance = balance;
        this.commission = commission;
    }

    protected BankAccount(double balance, byte commission) {
        this.balance = balance;
        this.commissionRate = commission;
    }

    public double getAmount() {
        return this.balance;
    }

    public void getMoney(double amount) {
        this.balance = this.balance - (amount + commission) - (amount * commissionRate) / 100;
    }
}
