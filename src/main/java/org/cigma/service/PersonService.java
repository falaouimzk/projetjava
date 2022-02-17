package org.cigma.service;

import org.cigma.entities.person.Gender;
import org.cigma.entities.person.Person;

public interface PersonService {

    public Person createStudent(String fullName, String lastName, Integer age, Gender gender, String cin);

}
