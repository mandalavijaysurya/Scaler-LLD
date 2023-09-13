package io.designpatterns;

public class Student implements Prototype<Student> {

    private String name;
    private String rollNumber;
    private int age;
    private String batch;

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public String getBatch() {
        return batch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + ", age=" + age + ", batch=" + batch + "]";
    }

    @Override
    public Student clone() {
        Student student = new Student();
        student.setName(this.name);
        student.setAge(this.age);
        student.setRollNumber(this.rollNumber);
        student.setBatch(this.batch);
        return student;
    }
}
