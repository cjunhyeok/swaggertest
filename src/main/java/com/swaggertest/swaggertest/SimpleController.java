package com.swaggertest.swaggertest;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SimpleController {

    @Operation(summary = "Swagger Test 요청", description = "Swagger Test")
    @GetMapping("/v1/test")
    public ResponseEntity testController() {
        return ResponseEntity.ok("ok");
    }
}
