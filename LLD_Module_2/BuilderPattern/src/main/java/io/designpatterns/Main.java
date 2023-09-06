package io.designpatterns;

import io.designpatterns.builder.Student;
import io.designpatterns.builder.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student = Student.builder()
                .age(20)
                .email("vijaysurya@gmail.com")
                .psp(100.00)
                .gradYear(2022)
                .universityName("SCALER")
                .phoneNumber("12313413")
                .build();
        System.out.println(student.toString());

        User user = User.builder()
                .setCountry("India")
                .setName("Vijaysurya")
                .setAge(19)
                .build();
        System.out.println(user.toString());
    }
}