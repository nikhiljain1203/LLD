package constructorchaining;

public class D extends C{

    String companyName;
    D() {
        super("Hello");

        System.out.println("Constructor of D called");
    }


}
