package io.practice;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String standard;
    private String section;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public Student clone() {
        Student student = new Student();
        student.age = this.age;
        student.name = this.name;
        student.section = this.section;
        student.standard = this.standard;
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", standard='" + standard + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
