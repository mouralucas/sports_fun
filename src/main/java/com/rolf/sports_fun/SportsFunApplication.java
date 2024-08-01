package com.rolf.sports_fun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rolf.sports_fun.repositories")
public class SportsFunApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportsFunApplication.class, args);
    }

}
