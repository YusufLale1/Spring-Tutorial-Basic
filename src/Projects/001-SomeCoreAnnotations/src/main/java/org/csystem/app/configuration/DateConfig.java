package org.csystem.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DateConfig {
    @Bean
    public LocalDate createNow()
    {
        System.out.println("DateConfig.createToday");
        return  LocalDate.now();
    }
}
