package prospec.model.proposition; 

public class CompositePropositions extends Proposition {

	protected Proposition[] propositions;

	public void setPropositions(Proposition[] propositions) {
this.propositions = propositions;
}

	public CompositePropositions(String name, String description) {
		super(name, description);
}

	public Proposition[] getAtomicPropositions() {
return propositions;
	}
}
