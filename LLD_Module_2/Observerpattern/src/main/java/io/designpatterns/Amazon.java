package io.designpatterns;

import java.util.List;
import java.util.ArrayList;
import io.designpatterns.services.Thirdpartyservice;
public class Amazon {
    List<Thirdpartyservice> services;

    public Amazon() {
        services = new ArrayList<>();
    }

    public void register(Thirdpartyservice service){
        services.add(service);
    }

    public void deRegister(Thirdpartyservice service){
        services.remove(service);
    }

    public void execute(){
        for(Thirdpartyservice service : services){
            service.run();
        }
    }
}
