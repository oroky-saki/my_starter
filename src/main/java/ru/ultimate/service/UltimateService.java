package ru.ultimate.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.ultimate.config.StarterUltimateProperties;

import java.time.LocalDate;

public class UltimateService {
    private final StarterUltimateProperties properties;

    @Autowired
    public UltimateService(StarterUltimateProperties properties) {
        this.properties = properties;
    }

    public String getAuthor() {
        return String.format("Author: %s %s", LocalDate.now().getYear(), properties.getAuthor());
    }

    public String getTag() {
        return String.format("TAG: %s", properties.getTag());
    }
}
