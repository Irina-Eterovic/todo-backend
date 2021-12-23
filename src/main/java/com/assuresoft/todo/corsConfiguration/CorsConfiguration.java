package com.assuresoft.todo.corsConfiguration;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CorsConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings( CorsRegistry registry ){
        registry.addMapping( "/**" )
                .allowedOrigins( "*" )
                .allowedMethods( HttpMethod.GET.name(), HttpMethod.POST.name(), HttpMethod.PUT.name(),
                        HttpMethod.DELETE.name(), HttpMethod.OPTIONS.name(), HttpMethod.PATCH.name() )
                .allowCredentials( true ).exposedHeaders( HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS )
                .allowedHeaders( HttpHeaders.CONTENT_TYPE, HttpHeaders.ACCEPT, HttpHeaders.AUTHORIZATION)
                .maxAge( 3600 );
    }
}
