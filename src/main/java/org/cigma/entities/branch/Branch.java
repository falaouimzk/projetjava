package org.cigma.entities.branch;

import java.util.ArrayList;
import java.util.Collection;

public class Branch extends Identification {

    private Level level;
    private Collection<BranchElement> elements;


    public Branch(String identifier, String label,Level level) {
        super(identifier, label);
        this.level = level;
        this.elements = new ArrayList<>();
    }

    public void createBranchElement(
            String identifier,
            String label
    ){
        this.elements.add(new BranchElement(identifier,label,this));

    }

    @Override
    public String toString() {
        String output =  super.toString();
        return "Branch " +output+  " => [ elements ] " + elements.toString();
    }
}
