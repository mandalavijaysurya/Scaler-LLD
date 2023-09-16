package io.designpatterns.ui;

import io.designpatterns.components.buttons.AndriodButton;
import io.designpatterns.components.buttons.Button;
import io.designpatterns.components.buttons.IOSButton;
import io.designpatterns.components.dropdowns.AndriodDropDown;
import io.designpatterns.components.dropdowns.DropDown;
import io.designpatterns.components.dropdowns.IOSDropDown;
import io.designpatterns.components.menus.AndriodMenu;
import io.designpatterns.components.menus.IOSMenu;
import io.designpatterns.components.menus.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
