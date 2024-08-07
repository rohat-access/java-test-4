package com.backstage.redhat;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

@SpringBootApplication(
    nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
@ComponentScan(
    basePackages = {"com.backstage.redhat", "com.backstage.redhat.api" , "com.backstage.redhat.config"},
    nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean(name = "com.backstage.redhat.Application.jsonNullableModule")
    public Module jsonNullableModule() {
        return new JsonNullableModule();
    }

}