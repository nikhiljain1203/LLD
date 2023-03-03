package designpatterns.factory;

public class Flutter {


    public void setTheme() {

    }

    public void setRefreshRate() {

    }

    public UIFactory createFactory(SupportedPlatform platform) {
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
