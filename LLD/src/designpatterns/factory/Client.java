package designpatterns.factory;

import designpatterns.factory.components.Button;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory =
            flutter.createFactory(SupportedPlatform.ANDROID);

        Button button = uiFactory.createButton();
        button.changeColor();
    }
}
