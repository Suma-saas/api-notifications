package com.sumasaas.services;

import com.sumasaas.models.ConfigurationSubscriber;
import com.sumasaas.repository.ConfigurationSubscriberRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicesApplication.class, args);
    }

}
