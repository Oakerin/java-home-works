package ru.qiwi.payments.service;

import org.springframework.stereotype.Service;
import ru.qiwi.payments.dataprovider.PaymentsDataProvider;
import ru.qiwi.payments.dto.PaymentWithCommission;
import ru.qiwi.payments.utils.PaymentUtil;

@Service
public class PaymentWithCommissionServiceImpl implements PaymentService {
    private final PaymentsDataProvider paymentsDataProvider;

    public PaymentWithCommissionServiceImpl(PaymentsDataProvider paymentsDataProvider) {
        this.paymentsDataProvider = paymentsDataProvider;
    }

    @Override
    public int getTotalSum() {
        PaymentUtil<PaymentWithCommission> payment = new PaymentUtil<>();
        int amount = payment.getAmount(this.paymentsDataProvider.getPaymentWithCommission());
        int commission = payment.getCommission(this.paymentsDataProvider.getPaymentWithCommission());
        return amount + commission;
    }

    @Override
    public int getPaymentsCount() {
        return new PaymentUtil<>().getCount(this.paymentsDataProvider.getPaymentWithCommission());
    }
}
