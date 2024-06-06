package com.example.apigateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockPaymentServiceController {

    @GetMapping("/payments/**")
    public ResponseEntity<String> getPayment() {
        return ResponseEntity.ok("Resposta do Payment Service");
    }
}