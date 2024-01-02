package com.zim.payment.interfaces.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.List;

public record PayRequest(
        @Schema(description = "구매자 정보")
        BuyerInfo buyerInfo,

        @Schema(description = "해당 결제 이벤트를 식별하는 전역적으로 고유한 ID")
        String checkoutId,

        @Schema(description = "암호화된 신용카드 정보 또는 결제 토큰. PSP마다 다른 값")
        CreditCardInfo creditCardInfo,

        @Schema(description = "결제 주문 목록")
        List<PaymentOrder> paymentOrders
) {
    public record BuyerInfo(){}

    public record CreditCardInfo(){}

    public record PaymentOrder(
            @Schema(description = "대금을 수령할 판매자")
            String sellerAccount,

            @Schema(description = "해당 주문으로 전송되어야 할 대금")
            BigDecimal amount,

            @Schema(description = "주문에 사용된 통화 단위")
            String currency, // TODO: enum

            @Schema(description = "해당 주문을 식별하는 전역적으로 고유한 ID")
            String paymentOrderId
    ){}
}
