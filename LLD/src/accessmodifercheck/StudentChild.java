package accessmodifercheck;

import accessmodifiers.Student;

public class StudentChild extends Student {

    public void doSomething() {
        this.Name = "Test";
        this.age = 12;
        //this.batchName = "TestBatch";
    }
}
