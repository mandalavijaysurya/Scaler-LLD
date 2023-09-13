package io.designpatterns;

public class Main {
    public static void main(String[] args) throws Exception {
        Student may2023 = new Student();
        may2023.setBatch("May 2023");
        Student aug2023 = new Student();
        aug2023.setBatch("Aug 2023");

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.getRegistry().put(may2023.getBatch(), may2023);
        studentRegistry.getRegistry().put(aug2023.getBatch(), aug2023);

        Student student = studentRegistry.getStudent("Aug 2023").clone();
        
        System.out.println(student.toString());

        student.setAge(18);
        student.setName("Vijaysurya Mandala");
        student.setRollNumber("15211A04C0");

        System.out.println(student.toString());

    }

}