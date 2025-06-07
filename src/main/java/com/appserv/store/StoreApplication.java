package com.appserv.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

      ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
      //var orderService = context.getBean(OrderService.class);
      var manager = context.getBean(NotificationManager.class);
      //var orderService = new OrderService(new PaypalPaymentService());
      //  orderService.placeOrder();
        manager.sendNotification("Hello World");
    }

}
