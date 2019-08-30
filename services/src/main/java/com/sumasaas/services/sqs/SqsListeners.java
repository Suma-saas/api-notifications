package com.sumasaas.services.sqs;

import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class SqsListeners {

    @SqsListener(value = "https://sqs.us-east-2.amazonaws.com/087627071411/Cotizaciones_completas", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void getMessage(Object message) {
        System.out.println("Message from SQS Queue - "+message);
    }

}
