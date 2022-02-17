package org.cigma.service.imp;

import org.cigma.entities.person.Person;
import org.cigma.entities.support.HeadQuarter;
import org.cigma.service.HeaderQuarterService;

public class HeadQuarterServiceImp implements HeaderQuarterService {

    private HeadQuarter currentHeaderQuarter;

    public HeadQuarterServiceImp(String label) {
        this.currentHeaderQuarter = new HeadQuarter(label);
    }


    @Override
    public void grantAccess(Person person, String code) {
        person.setIdentifier(code);
    }

    @Override
    public void revokeAccess(Person person) {
        final String accessCode = person.identifier();
        currentHeaderQuarter.revokeAccess(accessCode);
        person.setIdentifier(null);
    }

    @Override
    public Boolean hasAccess(Person person) {
        final String accessCode = person.identifier();
        return currentHeaderQuarter.hasAccess(accessCode);
    }
}
