package ru.gadetych.edu.java.colculator.controllers;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("API")
                .version("1.0.0")
                .license(new License()
                    .name("Vladislav Gadetov")
                    .url("https://github.com/Gadetych")));
    }

}
