package com.novianto.cloud.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("merchant", r ->
                        r.path("/v1/merchant/**")
                                .uri("http://localhost:8080/")
                )
                .route("user", r ->
                        r.path("/v1/user/**")
                                .uri("http://localhost:8080/")
                )
                .route("order", r ->
                        r.path("/v1/order/**")
                                .uri("http://localhost:8080/")
                )
                .route("product", r ->
                        r.path("/v1/product/**")
                                .uri("http://localhost:8080/")
                )
                .route("order-detail", r ->
                        r.path("/v1/order-detail/**")
                                .uri("http://localhost:8080/")
                )
                .build();
    }

}
