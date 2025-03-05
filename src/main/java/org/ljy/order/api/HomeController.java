package org.ljy.order.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public ResponseEntity<?> home() {
        return ResponseEntity.ok("msa-order");
    }

    @RequestMapping("/health-check")
    public ResponseEntity<?> healthCheck() {
        return ResponseEntity.ok("Good");
    }
}
