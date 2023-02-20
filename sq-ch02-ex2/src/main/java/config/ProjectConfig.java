package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //(1/4 We use @Configuration to tell Spring that this class is a configuration class)
public class ProjectConfig {

    @Bean //(2/4) By adding the @Bean annotation we instruct Spring to call this method and add the resulting bean to our Spring application context
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko"); //(2/4a) Set the name of the parrot to Koko
        return p; //(2/4b) Spring adds the Parrot instance to its context
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
