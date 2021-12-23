package com.assuresoft.todo.corsConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
public class CorsConfiguration extends WebMvcConfigurationSupport {
    @Override
    public void addCorsMappings( CorsRegistry registry ){
        registry.addMapping("/**")
                .allowedMethods("GET", "POST", "PUT", "DELETE","PATCH")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowCredentials(false);
    }
}
