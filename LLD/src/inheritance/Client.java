package inheritance;

public class Client {

    public static void main(String[] args) {
        Instructor i = new Instructor();
        i.batchName = "Test";
        i.userName = "Nikhil";
        i.avgRating = 4.5;

        i.login();
    }
}
