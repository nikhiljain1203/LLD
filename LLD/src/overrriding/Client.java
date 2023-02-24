package overrriding;

public class Client {

    public static void main(String[] args) {
        A a = new B();
        a.doSomething("Hello");
    }
}
