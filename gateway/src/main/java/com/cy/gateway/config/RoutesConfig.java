package com.cy.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutesConfig {

    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder locatorBuilder) {
        return locatorBuilder.routes()
                .route("test2", r -> r.path("/test1")
                        .uri("http://127.0.0.1:59091/"))
                .route("test1", r -> r.path("/test2")
                        .uri("http://127.0.0.1:59091/"))
                .route("test0", r -> r.path("/test0")
                        .filters(f -> f.circuitBreaker(c -> c.setName("commonCircuitBreaker")
                                .setFallbackUri("forward:/test1"))
                                .rewritePath("/test1", "/test2"))
                        .uri("http://127.0.0.1:59091/"))
                .build();
    }
}
