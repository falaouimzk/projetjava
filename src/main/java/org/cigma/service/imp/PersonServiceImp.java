package org.cigma.service.imp;

import org.cigma.entities.person.Gender;
import org.cigma.entities.person.Person;
import org.cigma.entities.person.Student;
import org.cigma.service.PersonService;

public class PersonServiceImp implements PersonService {


    @Override
    public Person createStudent(String fullName, String lastName, Integer age, Gender gender,String cin) {
        return new Student(fullName, lastName, age, gender,cin, null, null);
    }
}
