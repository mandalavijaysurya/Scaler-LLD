package io.designpatterns;

import io.designpatterns.ui.AndriodUIFactory;
import io.designpatterns.ui.IOSUIFactory;
import io.designpatterns.ui.UIFactory;
public class UIFactoryFactory {
    public UIFactoryFactory() {
    }

    public UIFactory createUI(SupportedPlatform platform) {

       return
               switch (platform){
                   case ANDRIOD -> new AndriodUIFactory();
                   case IOS -> new IOSUIFactory();
               };
    }
}