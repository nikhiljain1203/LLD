package constructor;

public class Student {
    public String Name;
    protected int age = 20;
    String batchName;
    private double psp;

    public Student() {
    }

    public Student (Student st) {
        this.Name = st.Name;
        this.age = st.age;
        this.batchName = st.batchName;
        this.psp = st.psp;
    }

}

