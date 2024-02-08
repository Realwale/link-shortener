package com.waletech.shorturl.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @io.swagger.v3.oas.annotations.info.Info(
                title = "ShortUrl Web App",
                version = "1.0",
                license = @License(name = "Apache License", url = "https://www.apache.org/licenses/LICENSE-2"),
                termsOfService = "Terms of Service"
        )
)
public class SwaggerConfig {
}
