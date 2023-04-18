package ru.qiwi.payments.service;

import org.springframework.stereotype.Service;
import ru.qiwi.payments.dataprovider.PaymentsDataProvider;
import ru.qiwi.payments.dto.Payment;

@Service
public class PaymentServiceImpl extends PaymentAbstractServiceImpl<Payment> implements PaymentService {
    private final PaymentsDataProvider paymentsDataProvider;

    public PaymentServiceImpl(PaymentsDataProvider paymentsDataProvider) {
        this.paymentsDataProvider = paymentsDataProvider;
    }

    @Override
    public Payment[] getPayments() {
        return paymentsDataProvider.getPayments();
    }

    @Override
    public int getTotalAmount(Payment payment) {
        return payment.getAmount();
    }

}
