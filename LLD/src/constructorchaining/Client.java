package constructorchaining;

public class Client {

    public static void main(String[] args) {
        //A a = new D();
        D d = (D) new A();
        d.companyName = "google";
    }
}
