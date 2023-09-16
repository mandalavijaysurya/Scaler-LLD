package io.designpatterns;


import io.designpatterns.components.buttons.Button;
import io.designpatterns.components.dropdowns.DropDown;
import io.designpatterns.components.menus.Menu;
import io.designpatterns.ui.UIFactory;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        UIFactoryFactory uiFactoryFactory = new UIFactoryFactory();
        UIFactory uiFactory = uiFactoryFactory.createUI(SupportedPlatform.IOS);
        Button button = uiFactory.createButton();
        DropDown dropDown = uiFactory.createDropDown();
        Menu menu = uiFactory.createMenu();
        button.click();
        dropDown.expand();
        menu.show();
    }
}

