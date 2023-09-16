package io.designpatterns.components.buttons;

public class IOSButton implements Button{

    @Override
    public void click() {
        System.out.println("Click IOS Button");
    }
}
