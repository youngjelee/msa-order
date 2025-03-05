package org.ljy.order.api;

import lombok.RequiredArgsConstructor;
import org.ljy.order.client.ProductServiceClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final ProductServiceClient productServiceClient;

    // 전체 주문 목록 조회
    @GetMapping
    public ResponseEntity<List<String>> getOrders() {
        return ResponseEntity.ok(List.of("Order #1001", "Order #1002", "Order #1003"));
    }

    // 단일 주문 조회
    @GetMapping("/{orderId}")
    public ResponseEntity<Map<String, String>> getOrder(@PathVariable String orderId) {
        return ResponseEntity.ok(Map.of("orderId", orderId, "status", "Processing"));
    }


    // ✅ Product 목록 조회 (Product 마이크로서비스 호출)
    @GetMapping("/products")
    public ResponseEntity<List<String>> getProducts() {
        return ResponseEntity.ok(productServiceClient.getProducts());
    }

    // ✅ 특정 Product 조회
    @GetMapping("/products/{productId}")
    public ResponseEntity<Map<String, String>> getProductById(@PathVariable String productId) {
        return ResponseEntity.ok(productServiceClient.getProductById(productId));
    }
}