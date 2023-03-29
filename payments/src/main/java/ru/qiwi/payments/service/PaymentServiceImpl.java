package ru.qiwi.payments.service;

import org.springframework.stereotype.Service;
import ru.qiwi.payments.dataprovider.PaymentsDataProvider;
import ru.qiwi.payments.dto.Payment;
import ru.qiwi.payments.utils.PaymentUtil;

@Service
public class PaymentServiceImpl implements PaymentService {
    private final PaymentsDataProvider paymentsDataProvider;

    public PaymentServiceImpl(PaymentsDataProvider paymentsDataProvider) {
        this.paymentsDataProvider = paymentsDataProvider;
    }

    @Override
    public int getTotalSum() {
        PaymentUtil<Payment> payment = new PaymentUtil<>();
        return payment.getAmount(this.paymentsDataProvider.getPayments());
    }

    @Override
    public int getPaymentsCount() {
        return new PaymentUtil<>().getCount(this.paymentsDataProvider.getPayments());
    }
}
