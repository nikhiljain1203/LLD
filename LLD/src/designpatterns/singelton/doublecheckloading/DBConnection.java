package designpatterns.singelton.doublecheckloading;

public class DBConnection {

    private static DBConnection instance = null;

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        if(instance == null) {
            synchronized (DBConnection.class) {
                if(instance == null) {
                    instance = new DBConnection();
                }
            }
        }

        return  instance;
    }

}
