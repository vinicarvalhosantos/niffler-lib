package br.com.vinicius.santos.nifflerlib;

import br.com.vinicius.santos.nifflerlib.config.NifflerLibConfig;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(NifflerLibConfig.class)
@EnableJpaAuditing
public @interface NifflerLibApplication {

}
