package ru.qiwi.payments.service;

public abstract class PaymentAbstractServiceImpl<T> {

    public abstract T[] getPayments();

    public abstract int getTotalAmount(T payment);

    public int getTotalSum() {
        int val = 0;

        for (T payment : getPayments())
        {
            val += getTotalAmount(payment);
        }

        return val;
    }

    public int getPaymentsCount() {
        return getPayments().length;
    }
}
