package com.brian.egreenhouse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class RestClientConfig {

    @Bean
    public WebClient getWebClient() {
        return WebClient.create("https://api.thingspeak.com");
    }
}
