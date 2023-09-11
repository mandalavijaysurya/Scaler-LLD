package io.designpatterns;

public class Student implements Prototype<Student> {

    private String name;
    private String rollNumber;
    private int age;
    private String standard;
    private String section;

    
    public String getName() {
        return name;
    }


    public String getRollNumber() {
        return rollNumber;
    }


    public int getAge() {
        return age;
    }


    public String getStandard() {
        return standard;
    }


    public String getSection() {
        return section;
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


    public void setStandard(String standard) {
        this.standard = standard;
    }


    public void setSection(String section) {
        this.section = section;
    }
    

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + ", age=" + age + ", standard=" + standard
                + ", section=" + section + "]";
    }


    @Override
    public Student clone(){
        Student student = new Student();
        student.setName(this.name);
        student.setAge(this.age);
        student.setRollNumber(this.rollNumber);
        student.setStandard(this.standard);
        student.setSection(this.section);
        return student;
    }
}
