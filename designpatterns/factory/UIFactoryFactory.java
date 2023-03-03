package designpatterns.factory;

import overrriding.A;

public class UIFactoryFactory {

    public static UIFactory getUIFactoryForPlatform(SupportedPlatform platform) {
        if(platform == SupportedPlatform.ANDROID) {
            return new AndroidFactory();
        } else {
            return new IosFactory();
        }
    }
}
