package com.qs.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetWeyConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_qs1",r -> r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .route("path_route_qs2",r -> r.path("guoji").uri("http://news.baidu.com/guoji"));
        return routes.build();
    }
}
