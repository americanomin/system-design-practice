package com.zim.payment.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@Getter
@Entity
@ToString
@NoArgsConstructor
@Table(name = "payment_order")
public class PaymentOrderJpaEntity {
    @Id
    private String paymentOrderId; // TODO: 자동으로 uuid 등등의 키로 생성
    private String buyerAccount; // TODO: 암호화
    private BigDecimal amount; // TODO: MONEY 값객체
    private String currency; // TODO: ENUM
    private String checkoutId; // TODO: FK?

    @Enumerated(EnumType.STRING)
    private Status status;

    private boolean ledger_updated;
    private boolean wallet_updated;

    @Getter
    @RequiredArgsConstructor
    public enum Status {
        SUCCESS, FAIL;
    }
}
