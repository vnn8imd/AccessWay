package com.accessway.backend.controller;

import com.accessway.backend.dto.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/health")
    public HealthResponse health() {
        return new HealthResponse(
                "UP",
                "AccessWay backend funcionando correctamente"
        );
    }
}
