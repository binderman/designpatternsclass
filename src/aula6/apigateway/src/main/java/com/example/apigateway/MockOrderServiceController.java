package com.example.apigateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockOrderServiceController {

    @GetMapping("/orders/**")
    public ResponseEntity<String> getOrder() {
        return ResponseEntity.ok("Resposta do Order Service");
    }
}