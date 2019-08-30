package com.sumasaas.services.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationsController {

    @Value("${cloud.aws.end-point.uri}")
    private String sqsEndPoint;

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @GetMapping
    public void sendMessage() {
        queueMessagingTemplate.send(sqsEndPoint,
                MessageBuilder
                        .withPayload("hello from Spring Boot")
                        .setHeader("idEmpresa", "123")
                        .build()
        );
    }
}
