package org.cigma.entities.person;

public class Student extends Person {
    private String identifier;
    private String email;
    private String phoneNumber;

    public Student(String firstName, String lastName,
                   Integer age, Gender gender,String cin, String email,
                   String phoneNumber) {
        super(firstName, lastName, age, gender,cin);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.cin = cin;
    }

    @Override
    public String identifier() {
        return identifier;
    }

    @Override
    public void setIdentifier(String code) {
        this.identifier = code;
    }



    @Override
    public String toString() {
        return "Student{" +
                "identifier='" + identifier + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
