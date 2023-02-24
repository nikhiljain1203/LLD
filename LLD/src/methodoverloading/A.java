package methodoverloading;

public class A {

    //name: doSomething
    // Sign: doSomething()
    int doSomething() {
        System.out.println("Hello");
        return 0;
    }

    //name: doSomething
    // sign: doSomething(String)
    void doSomething(String s) {
        System.out.println("Hello" + s);
    }
}
