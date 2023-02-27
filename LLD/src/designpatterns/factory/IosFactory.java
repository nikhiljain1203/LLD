package designpatterns.factory;

import designpatterns.factory.components.AndroidButton;
import designpatterns.factory.components.Button;
import designpatterns.factory.components.Menu;

public class IosFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
