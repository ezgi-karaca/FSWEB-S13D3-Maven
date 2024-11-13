package org.example;

public class Person {
    String firstname;
    String lastname;
    String city;
    String maritalStatus;
    String jobTitle;
    int age;

    public Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age, String city, String maritalStatus, String jobTitle){
        this(firstname, lastname, age);
        this.city = city;
        this.maritalStatus = maritalStatus;
        this.jobTitle = jobTitle;
    }
    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        if (age>=13 && age<=19) {
            return true;
        }
        return false;
    }


}
