package ru.qiwi.payments.service;

import org.springframework.stereotype.Service;
import ru.qiwi.payments.dataprovider.PaymentsDataProvider;
import ru.qiwi.payments.dto.PaymentWithCommission;

import java.util.function.Supplier;

@Service
public class PaymentWithCommissionServiceImpl extends PaymentAbstractServiceImpl<PaymentWithCommission> implements PaymentService {
    private final PaymentsDataProvider paymentsDataProvider;

    public PaymentWithCommissionServiceImpl(PaymentsDataProvider paymentsDataProvider) {
        this.paymentsDataProvider = paymentsDataProvider;
    }

    @Override
    public Supplier<PaymentWithCommission[]> getPayments() {
        return paymentsDataProvider::getPaymentWithCommission;
    }

    @Override
    public int getTotalAmount(PaymentWithCommission payment) {
        return payment.getAmount() + payment.getCommission();
    }
}
