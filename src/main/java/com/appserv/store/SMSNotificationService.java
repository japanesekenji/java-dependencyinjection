package com.appserv.store;

import org.springframework.stereotype.Service;

@Service("SMS")
public class SMSNotificationService implements NotificationService{

    public void send(String message, String emailRecipient){

        System.out.println("SMS Notification");
        System.out.println("Notification: "+ message);
    }

}
