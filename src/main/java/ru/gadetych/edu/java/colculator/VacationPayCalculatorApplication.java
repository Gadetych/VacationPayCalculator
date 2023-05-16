package ru.gadetych.edu.java.colculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.gadetych.edu.java.colculator.configuration.ApplicationConfig;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfig.class)
public class VacationPayCalculatorApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(VacationPayCalculatorApplication.class, args);
        ApplicationConfig applicationConfig = ctx.getBean(ApplicationConfig.class);
        System.out.println(applicationConfig);
    }

}
