package com.zim.hotel.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        var info = new Info()
                .title("대규모 시스템 설계 기초")
                .version("v1.0.0")
                .description("대규모 시스템 설계 기초 실습 코드");

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}