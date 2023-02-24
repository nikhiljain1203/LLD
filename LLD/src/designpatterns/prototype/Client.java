package designpatterns.prototype;

public class Client {

    public static void fillRegistry(Registry registry) {
        Student aprBatch = new Student();
        aprBatch.averageBatchPsp = 80;
        aprBatch.batchName = "AprilBatch";

        registry.register("AprilBatch", aprBatch);

        IntelligentStudent aprInStBatch = new IntelligentStudent();
        aprInStBatch.averageBatchPsp = 80;
        aprInStBatch.batchName = "AprilBatch";
        aprInStBatch.IQ = 100;

        registry.register("AprilInStBatch", aprInStBatch);
    }

    public static void main(String[] args) {

        Registry registry = new Registry();
        fillRegistry(registry);

        Student sriram = registry.get("AprilBatch").clone();
        sriram.setName("Sriram");
        sriram.setAge(27);
        sriram.setPsp(78);

        Student avi = registry.get("AprilInStBatch").clone();
        avi.setName("AVI");
        avi.setAge(27);
        avi.setPsp(78);

        System.out.println("Debug");
    }
}
