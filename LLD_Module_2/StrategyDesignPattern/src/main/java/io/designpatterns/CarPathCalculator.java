package io.designpatterns;

public class CarPathCaluator implements PathCalculator {
    @Override
    public void calculateDistance(String source, String destination) {
        System.out.println("Distance was calculated from "+source+" to "+destination+" for Car");
    }
}
