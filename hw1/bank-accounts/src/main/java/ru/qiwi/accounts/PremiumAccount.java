package ru.qiwi.accounts;

public class PremiumAccount extends BankAccount {
    static double commission = 1;
    public PremiumAccount(double balance) {
        super(balance, commission);
    }
}
