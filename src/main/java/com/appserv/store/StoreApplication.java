package com.appserv.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

      ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
      //var orderService = context.getBean(OrderService.class);
      //var manager = context.getBean(NotificationManager.class);
      //var resource = context.getBean(HeavyResource.class);
      //var orderService = new OrderService(new PaypalPaymentService());
      //  orderService.placeOrder();

      //  manager.sendNotification("Hello World");
      //  context.close();
      //  var UserService = context.getBean(UserService.class);
      //  UserService.registerUser(new User(1L,"admin@gmail.com","admin","admin"));
    }

}
