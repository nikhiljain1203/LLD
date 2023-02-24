package designpatterns.prototype;

public class IntelligentStudent extends Student{

    int IQ;

    IntelligentStudent() {

    }

    IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.IQ = student.IQ;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
