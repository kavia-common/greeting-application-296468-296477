package com.example.springbootbackend;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PUBLIC_INTERFACE
 * GreetingController provides a simple GET /hello endpoint returning a greeting message.
 */
@RestController
@Tag(name = "Greeting", description = "Endpoints related to greeting messages")
public class GreetingController {

    // PUBLIC_INTERFACE
    @GetMapping("/hello")
    @Operation(
            summary = "Get greeting",
            description = "Returns a static greeting message from the Spring Boot backend."
    )
    public String hello() {
        return "Hello from Spring Boot!";
    }
}
