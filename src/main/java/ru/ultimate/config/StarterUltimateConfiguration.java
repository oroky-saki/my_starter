package ru.ultimate.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.ultimate.service.LowerService;
import ru.ultimate.service.TextService;
import ru.ultimate.service.UltimateService;
import ru.ultimate.service.CapsService;

@EnableConfigurationProperties({StarterUltimateProperties.class, ServiceProperties.class})
@Configuration
public class StarterUltimateConfiguration {

    /**
     *  Создание бина UltimateService
     *
     * @param properties свойства из application.yaml
     * @return бин UltimateService
     */
    @Bean
    public UltimateService ultimateService(StarterUltimateProperties properties) {
        return new UltimateService(properties);
    }

    /**
     * Бин CapsService будет создан, если поле проперти service.addText имеет любое значение
     *
     * @param properties свойства из application.yaml
     * @return бин CapsService
     */
    @Bean
    @ConditionalOnProperty(prefix = "service", name = "addText")
    public CapsService capsService(ServiceProperties properties) {
        return new CapsService(properties);
    }

    /**
     * Если бин CapsService не создан, то будет создан бин LowerService
     *
     * @param properties свойства из application.yaml
     * @return бин CapsService
     */
    @Bean
    @ConditionalOnMissingBean(CapsService.class)
    public TextService textService(ServiceProperties properties) {
        return new LowerService(properties);
    }
}
