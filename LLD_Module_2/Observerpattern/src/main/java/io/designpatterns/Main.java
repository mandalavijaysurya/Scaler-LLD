package io.designpatterns;

import io.designpatterns.services.Implementation.Deliveryservice;
import io.designpatterns.services.Implementation.Notificationservice;
import io.designpatterns.services.Implementation.Paymentservice;

public class Main {
    public static void main(String[] args) {

        Amazon amazon = new Amazon();

        Deliveryservice deliveryservice = new Deliveryservice();
        Notificationservice notificationservice = new Notificationservice();
        Paymentservice paymentservice = new Paymentservice();

        System.out.println("Observer design pattern:");
        System.out.println("----------------------------------------------------");

        amazon.register(deliveryservice);
        amazon.register(notificationservice);
        amazon.register(paymentservice);

        amazon.execute();

        System.out.println("----------------------------------------------------");

        amazon.deRegister(deliveryservice);

        amazon.execute();
    }
}