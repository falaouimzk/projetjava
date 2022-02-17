package org.cigma.entities.branch;

public class BranchElement extends Identification {

    private Branch branch;

    public BranchElement(String identifier, String label,Branch branch) {
        super(identifier, label);
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "BranchElement" + super.toString();
    }
}
