package io.designpatterns.Cars;

public class Main {
    public static void main(String[] args) {
        Tata tata = new Tata("Tata",1000,4,"BKJ1HK34C1FR4");
        Tata nexon = tata.clone();
        nexon.setSerialNumber("N3X0BBBJ48FHG");
        System.out.println(nexon.toString());
    }
}
