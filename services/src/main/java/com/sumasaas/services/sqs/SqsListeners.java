package com.sumasaas.services.sqs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class SqsListeners {

    @SqsListener(value = "${cloud.aws.end-point.uri}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void getMessage(Object message) {
        System.out.println("Message from SQS Queue - "+message);
    }

}
