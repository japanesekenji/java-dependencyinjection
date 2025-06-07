package com.appserv.store;

import org.springframework.stereotype.Service;

@Service("Email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message){

        System.out.println("Email Notification");
        System.out.println("Notification: "+ message);
    }
}
