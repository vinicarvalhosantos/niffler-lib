package br.com.vinicius.santos.nifflerlib.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:nifflerlib-application.properties")
public class NifflerLibConfig {
}
