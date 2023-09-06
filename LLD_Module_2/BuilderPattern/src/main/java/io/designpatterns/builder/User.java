package io.designpatterns.builder;

import java.util.Objects;

public class User {

    private String name;
    private int age;
    private int phoneNumber;
    private String country;
    private enum GENDER{MALE,FEMALE};

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", country='" + country + '\'' +
                '}';
    }

    public User(String name, int age, int phoneNumber, String country) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.country = country;
    }

    public static Builder builder(){
        return new Builder();
    }
    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private int getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String getCountry() {
        return country;
    }

    private void setCountry(String country) {
        this.country = country;
    }



    public static class Builder{

        private String name;
        private int age;
        private int phoneNumber;
        private String country;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public String getCountry() {
            return country;
        }

        public static Builder builder(){
            return new Builder();
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setPhoneNumber(int phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setCountry(String country){
            this.country = country;
            return this;
        }
        private void validate() throws RuntimeException{
            if(age < 18)
                throw new RuntimeException("Age is under 18 years, you are not eligible");
            if(!Objects.equals(country, "India"))
                throw new RuntimeException("Thanks for signing up, we are in process of expanding...");
        }
        public User build(){
            validate();
            return new User(name, age, phoneNumber, country);
        }
    }
}
