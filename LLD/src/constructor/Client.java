package constructor;

public class Client {

    public static void main(String[] args) {
        Student st = new Student();

        Student st1 = new Student(st);

        doSomething(st1);

        Student st2 = st1;
        System.out.println("Debug");

    }

    public static void doSomething(Student st) {
        st.Name = "XYZ";
    }
}