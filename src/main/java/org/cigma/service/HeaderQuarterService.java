package org.cigma.service;

import org.cigma.entities.person.Person;

public interface HeaderQuarterService {


    void grantAccess(Person person, String code);

    void revokeAccess(Person person);

    Boolean hasAccess(Person person);


}
