package org.cigma.entities.support;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HeadQuarter {
    private String label;
    private Collection<String> access;
    private Collection<String> revokedAccess;

    public HeadQuarter(String label) {
        this.label = label;
        this.access = new HashSet<>();
        this.revokedAccess = new HashSet<>();
    }

    public void grantAccess(String code) {
        if (revokedAccess.contains(code)) {
            revokedAccess.remove(code);
            access.add(code);
        }
    }

    public void revokeAccess(String code) {
        if (access.contains(code)) {
            access.remove(code);
            revokedAccess.add(code);
        }
    }

    public Boolean hasAccess(String code) {
        return !this.revokedAccess.contains(code) && this.access.contains(code);
    }

    public Collection<String> getRevokedAccess() {
        return Collections.unmodifiableCollection(revokedAccess);
    }

    @Override
    public String toString() {
        return "HeadQuarter{" +
                "label='" + label + '\'' +
                ", access=" + access +
                '}';
    }
}
