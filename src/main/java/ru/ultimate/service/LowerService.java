package ru.ultimate.service;

import ru.ultimate.config.ServiceProperties;

public class LowerService implements TextService {
    private final ServiceProperties properties;

    public LowerService(ServiceProperties properties) {
        this.properties = properties;
    }

    @Override
    public String changeText() {
        return properties.getSomeText().toLowerCase();
    }
}
