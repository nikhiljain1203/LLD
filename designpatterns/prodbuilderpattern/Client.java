package designpatterns.prodbuilderpattern;

import designpatterns.prodbuilderpattern.Student.Builder;

public class Client {

    public static void main(String[] args) {
        Builder builder = Student.getBuilder();
        builder.setName("XYZ");
        builder.setAge(20);

        Student st = builder.build();


        Student st1 = Student.getBuilder()
                        .setName("XYZ")
                        .setAge(20)
                        .build();

    }
}
