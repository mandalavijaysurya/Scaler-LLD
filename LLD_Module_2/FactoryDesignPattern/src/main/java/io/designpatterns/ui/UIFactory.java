package io.designpatterns.ui;

import io.designpatterns.components.buttons.Button;
import io.designpatterns.components.dropdowns.DropDown;
import io.designpatterns.components.menus.Menu;

    public interface UIFactory {
        Button createButton();

        Menu createMenu();

        DropDown createDropDown();
    }

