package com.founder.fas;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ="com.founder.fas")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
    	new SpringApplicationBuilder(Application.class).run(args);
    }

}
