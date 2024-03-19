package ru.ultimate.service;

import ru.ultimate.config.ServiceProperties;

public class CapsService implements TextService {
    private final ServiceProperties properties;

    public CapsService(ServiceProperties properties) {
        this.properties = properties;
    }

    @Override
    public String changeText() {
        return properties.getSomeText().toUpperCase() + " AND ADDITIONAL TEXT: " + properties.getAddText();
    }
}
