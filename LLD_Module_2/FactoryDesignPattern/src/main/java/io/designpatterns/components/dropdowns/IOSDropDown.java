package io.designpatterns.components.dropdowns;

public class IOSDropDown implements DropDown {
    @Override
    public void expand() {
        System.out.println("Expanding IOS dropdown");
    }
}
