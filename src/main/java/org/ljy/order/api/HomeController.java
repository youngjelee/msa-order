package org.ljy.product.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @RequestMapping("/")
    public ResponseEntity<?> home() {
        return ResponseEntity.ok("msa-product");
    }

    @RequestMapping("/health-check")
    public ResponseEntity<?> healthCheck() {
        return ResponseEntity.ok("Good");
    }
}
