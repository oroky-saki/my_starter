package ru.ultimate.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "service")
public class ServiceProperties {
    private String addText;
    private String someText;

    public String getAddText() {
        return addText;
    }

    public void setAddText(String addText) {
        this.addText = addText;
    }

    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }
}
