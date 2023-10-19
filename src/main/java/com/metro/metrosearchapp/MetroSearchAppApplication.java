package com.metro.metrosearchapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories("com.metro.metrosearchapp.repository.elastic")
@EnableJpaRepositories("com.metro.metrosearchapp.repository")
public class MetroSearchAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetroSearchAppApplication.class, args);
    }

}
