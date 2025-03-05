package org.ljy.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Map;

@FeignClient(name = "product-service", url = "${product-service.url:}")  // ✅ 기본값 "" 설정
public interface ProductServiceClient {

    @GetMapping("/products")
    List<String> getProducts();

    @GetMapping("/products/{productId}")
    Map<String, String> getProductById(@PathVariable("productId") String productId);
}
