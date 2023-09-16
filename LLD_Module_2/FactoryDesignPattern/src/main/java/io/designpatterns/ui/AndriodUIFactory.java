package io.designpatterns.ui;

import io.designpatterns.components.buttons.AndriodButton;
import io.designpatterns.components.buttons.Button;
import io.designpatterns.components.dropdowns.AndriodDropDown;
import io.designpatterns.components.dropdowns.DropDown;
import io.designpatterns.components.menus.AndriodMenu;
import io.designpatterns.components.menus.Menu;

public class AndriodUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndriodButton();
    }

    @Override
    public Menu createMenu() {
        return new AndriodMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndriodDropDown();
    }
}
