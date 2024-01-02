package com.zim.payment.interfaces;

import com.zim.payment.interfaces.dto.PayRequest;
import com.zim.payment.interfaces.dto.PayResponse;
import com.zim.payment.interfaces.dto.PaymentRetrieveResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/payments")
@Validated
public class PaymentController {

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<PayResponse> pay(@RequestBody @Valid PayRequest payRequest) {
        return ResponseEntity.ok(new PayResponse("paymentOrderId"));
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/{paymentOrderId}")
    public ResponseEntity<PaymentRetrieveResponse> retrieve(@PathVariable("paymentOrderId") String paymentOrderId) {
        return ResponseEntity.ok(new PaymentRetrieveResponse(paymentOrderId));
    }
}
