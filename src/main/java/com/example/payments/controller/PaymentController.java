package com.example.payments.controller;

import com.example.payments.dto.Paymentdto;
import com.example.payments.model.Payment;
import com.example.payments.service.PaymentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/initiate")
    public ResponseEntity<Payment> initiatePayment(@RequestBody @Valid Paymentdto payment) {
        return new ResponseEntity<>(paymentService.initiatePayment(payment), HttpStatus.OK);
    }
}
