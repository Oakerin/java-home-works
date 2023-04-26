package ru.qiwi.payments.service;

import org.springframework.stereotype.Service;
import ru.qiwi.payments.dataprovider.PaymentsDataProvider;
import ru.qiwi.payments.dto.PaymentWithCommission;

@Service
public class PaymentWithCommissionServiceImpl extends PaymentAbstractServiceImpl<PaymentWithCommission> implements PaymentService {
    private final PaymentsDataProvider paymentsDataProvider;

    public PaymentWithCommissionServiceImpl(PaymentsDataProvider paymentsDataProvider) {
        this.paymentsDataProvider = paymentsDataProvider;
        this.getPayments = this.paymentsDataProvider::getPaymentWithCommission;
        this.getTotalAmount = (payment) -> payment.getAmount() + payment.getCommission();
    }
}
