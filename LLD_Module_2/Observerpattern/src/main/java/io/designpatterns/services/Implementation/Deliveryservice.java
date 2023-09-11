package io.designpatterns.services.Implementation;

import io.designpatterns.services.Thirdpartyservice;

public class Deliveryservice implements Thirdpartyservice {

    @Override
    public void run() {
        System.out.println("Running Delivery service");
    }

}
