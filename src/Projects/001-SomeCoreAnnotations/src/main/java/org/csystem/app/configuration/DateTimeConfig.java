package org.csystem.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class DateTimeConfig {
    @Bean
    public LocalDateTime createNow()
    {
        System.out.println("DateTimeConfig.createNow");
        return  LocalDateTime.now();
    }
}
