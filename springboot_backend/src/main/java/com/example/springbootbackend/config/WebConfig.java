package com.example.springbootbackend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * PUBLIC_INTERFACE
 * WebConfig sets global CORS configuration allowing the Vue frontend during local dev and preview hosts.
 *
 * Allowed origins:
 * - http://localhost:3000
 * - http://127.0.0.1:3000
 * - http://0.0.0.0:3000
 * - https://*.cloud.kavia.ai:3000 (preview host pattern; note: Spring CORS does not support wildcard subdomains
 *   with arbitrary dots out-of-the-box. We enumerate common dev hosts and enable allowedOriginPatterns for wildcard.)
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    // PUBLIC_INTERFACE
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                // Use allowedOriginPatterns to support wildcard domains for preview environments
                .allowedOriginPatterns(
                        "http://localhost:3000",
                        "http://127.0.0.1:3000",
                        "http://0.0.0.0:3000",
                        "https://*.cloud.kavia.ai:3000",
                        "https://*.cloud.kavia.ai"
                )
                .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
