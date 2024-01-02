package com.zim.payment.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Entity
@ToString
@NoArgsConstructor
@Table(name = "payment_event")
public class PaymentEventJpaEntity {
    @Id
    private String checkoutId;
    private String buyerInfo;
    private String sellerInfo;
    private String creditCardInfo;
    private boolean isPaymentDone;
}
