package io.designpatterns.services.Implementation;

import io.designpatterns.services.Thirdpartyservice;

public class Paymentservice implements Thirdpartyservice {

    @Override
    public void run() {
        System.out.println("Running payment service");
    }
}
