package ru.qiwi.payments.service;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public abstract class PaymentAbstractServiceImpl<T> {

    public abstract Supplier<T[]> getPayments();

    public abstract int getTotalAmount(T payment);

    public int getTotalSum() {
        Stream<T> payments = Arrays.stream(getPayments().get());
        return payments.mapToInt(this::getTotalAmount).sum();
    }

    public int getPaymentsCount() {
        return getPayments().get().length;
    }
}
