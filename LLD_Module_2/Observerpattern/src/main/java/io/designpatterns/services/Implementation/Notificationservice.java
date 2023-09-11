package io.designpatterns.services.Implementation;

import io.designpatterns.services.Thirdpartyservice;

public class Notificationservice implements Thirdpartyservice {

    @Override
    public void run() {
        System.out.println("Running notification service");
    }

}
