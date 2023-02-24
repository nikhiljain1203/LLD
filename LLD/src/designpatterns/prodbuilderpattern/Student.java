package designpatterns.prodbuilderpattern;

public class Student {

    String name;
    int age;
    String gender;
    String universityName;
    String gradYear;
    double cgpa;
    String address;

    private Student(Builder builder) {
        // validation
        if(builder.age > 100) {
            throw new IllegalArgumentException("Age can't be greater than 100");
        }

        this.name = builder.name;
        this.age = builder.age;
    }


    static Builder getBuilder() {
        return new Builder();
    }

    static class Builder {
        String name;
        int age;
        String gender;
        String universityName;
        String gradYear;
        double cgpa;
        String address;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getUniversityName() {
            return universityName;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }

        public String getGradYear() {
            return gradYear;
        }

        public void setGradYear(String gradYear) {
            this.gradYear = gradYear;
        }

        public double getCgpa() {
            return cgpa;
        }

        public void setCgpa(double cgpa) {
            this.cgpa = cgpa;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Student build() {
            return new Student(this);
        }
    }

}
