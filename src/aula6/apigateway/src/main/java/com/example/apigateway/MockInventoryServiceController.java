package com.example.apigateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockInventoryServiceController {

    @GetMapping("/inventory/**")
    public ResponseEntity<String> getInventory() {
        return ResponseEntity.ok("Resposta do Inventory Service");
    }
}