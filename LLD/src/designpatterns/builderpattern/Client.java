package designpatterns.builderpattern;

public class Client {

    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.setName("XYZ");
        helper.setAge(20);

        Student st = new Student(helper);
    }
}
