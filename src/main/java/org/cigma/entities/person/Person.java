package org.cigma.entities.person;

public abstract class Person implements Access {
    protected String firstName;
    protected String lastName;
    protected Integer age;
    protected Gender gender;
    protected String cin;

    /*
    *
    * Constructor of Person !
    *
    * */
    public Person(String firstName, String lastName, Integer age, Gender gender,String cin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.cin = cin;

    }
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public String getCin() {
        return cin;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
