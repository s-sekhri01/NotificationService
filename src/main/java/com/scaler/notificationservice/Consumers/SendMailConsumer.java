package com.scaler.notificationservice.Consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SendMailConsumer {

    @KafkaListener(topics = "sendEmail", groupId = "emailService")
    public void handleSendEmail(String message) {
        System.out.println("Message Received" + message);
        //send email, sms, whatsapp, push notification
    }
}
