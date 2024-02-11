package ru.netology;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaProfileConfig {
    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "false", matchIfMissing = true)
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "true")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
