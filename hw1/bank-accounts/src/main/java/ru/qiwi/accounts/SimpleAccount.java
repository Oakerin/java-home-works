package ru.qiwi.accounts;

public class SimpleAccount extends BankAccount {
    static byte commission = 5;
    public SimpleAccount(double balance) {
        super(balance, commission);
    }
}
