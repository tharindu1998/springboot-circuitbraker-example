package com.springboot.services;

import org.springframework.stereotype.Service;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class TestService {

    @CircuitBreaker(name = "testService", fallbackMethod = "fallbackMethod")
    public String invokeExternalService() {
        // Here you can simulate a call to an external service
        // In a real-world scenario, this could be an HTTP call, database query, etc.
        if (Math.random() > 0.5) {
            throw new RuntimeException("Service failure");
        }
        return "External service response";
    }

    public String fallbackMethod(Exception e) {
        return "Fallback response";
    }
}