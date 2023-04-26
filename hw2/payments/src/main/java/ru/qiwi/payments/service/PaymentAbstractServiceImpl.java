package ru.qiwi.payments.service;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public abstract class PaymentAbstractServiceImpl<T> {
    public Supplier<T[]> getPayments;
    public ToIntFunction<T> getTotalAmount;

    public int getTotalSum() {
        return Arrays.stream(getPayments.get())
                .mapToInt(getTotalAmount)
                .sum();
    }

    public int getPaymentsCount() {
        return getPayments.get().length;
    }
}
