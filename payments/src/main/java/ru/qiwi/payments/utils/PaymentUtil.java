package ru.qiwi.payments.utils;

import ru.qiwi.payments.dto.Payment;
import ru.qiwi.payments.dto.PaymentWithCommission;

public class PaymentUtil<T extends Payment> {
    public int getCount(T[] payments) {
        return payments.length;
    }

    public int getAmount(T[] payments) {
        int val = 0;
        for (T payment : payments)
        {
            val += payment.getAmount();
        }
        return val;
    }

    public int getCommission(T[] payments) {
        int val = 0;
        for (T payment : payments)
        {
            val += ((PaymentWithCommission)payment).getCommission();
        }
        return val;
    }
}
