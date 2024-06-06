package com.example.apigateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class ApigatewayApplication {

    @Value("${order.service.url}")
    private String orderServiceUrl;

    @Value("${inventory.service.url}")
    private String inventoryServiceUrl;

    @Value("${payment.service.url}")
    private String paymentServiceUrl;

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("order_route", r -> r.path("/orders/**")
                .filters(f -> f.addRequestHeader("X-Gateway-Request", "OrderService")
                               .retry(config -> config.setRetries(2).setStatuses(HttpStatus.INTERNAL_SERVER_ERROR)))
                .uri(orderServiceUrl))
            .route("inventory_route", r -> r.path("/inventory/**")
                .filters(f -> f.addRequestParameter("source", "gateway"))
                .uri(inventoryServiceUrl))
            .route("payment_route", r -> r.path("/payments/**")
                .filters(f -> f.circuitBreaker(config -> config.setName("paymentCircuitBreaker")
                                                              .setFallbackUri("forward:/fallback/payment")))
                .uri(paymentServiceUrl))
            .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(ApigatewayApplication.class, args);
    }
}