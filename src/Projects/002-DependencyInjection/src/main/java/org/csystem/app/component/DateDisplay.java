package org.csystem.app.component;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class DateDisplay {
    private LocalDate m_today;
    private DateTimeFormatter m_formatter;
    @Autowired
    public void setToday(LocalDate today)
    {
        m_today = today;
    }
    @Autowired
    public void setFormatter(@Qualifier("dateFormatter") DateTimeFormatter formatter) //setter / property injection
    {
        m_formatter = formatter;
    }

    @PostConstruct
    public void display()
    {
        System.out.printf("Today:%s%n", m_formatter.format(m_today));
    }
}
