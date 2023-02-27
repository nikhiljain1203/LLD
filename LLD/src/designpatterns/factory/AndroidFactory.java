package designpatterns.factory;

import designpatterns.factory.components.AndroidButton;
import designpatterns.factory.components.AndroidMenu;

public class AndroidFactory implements UIFactory{

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
