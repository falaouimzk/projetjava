package org.cigma.entities.branch;

public class Identification {
    protected String identifier;
    protected String label;

    public Identification(String identifier, String label) {
        this.identifier = identifier;
        this.label = label;
    }

    @Override
    public String toString() {
        return String.format("{ identifier : %s ," +
                " label : %s }",this.identifier,this.label);


    }

}
