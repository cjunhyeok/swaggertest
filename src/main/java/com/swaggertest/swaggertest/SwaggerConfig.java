package com.swaggertest.swaggertest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "SwaggerTest",
        description = "Swagger Test 를 위한 프로젝트",
        version = "v1")
)
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi openApi() {
        String[] paths = {"/v1/**"};

        return GroupedOpenApi.builder()
                .group("Swagger Test V1")
                .pathsToMatch(paths)
                .build();
    }
}
