package io.designpatterns;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vijaysurya Mandala");
        student.setAge(18);
        student.setRollNumber("15211A04C0");
        student.setStandard("Tenth");
        student.setSection("Alpha");

        System.out.println("Existing Student: " + student.toString());

        Student studentClone = getClone(student);
        studentClone.setRollNumber("15211A04B9");
        studentClone.setName("Ravali Manda");
        
        System.out.println("Cloned Student: " + studentClone.toString());

    }

    public static Student getClone(Student student) {
        return student.clone();
    }

}