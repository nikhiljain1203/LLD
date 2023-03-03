package designpatterns.factory;


import designpatterns.factory.components.Button;
import designpatterns.factory.components.Menu;

public interface UIFactory {

    public Button createButton();
    public Menu createMenu();

}
