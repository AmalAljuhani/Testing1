package prospec.model.proposition; 



public class ConsecutiveC extends CompositePropositions {

	public ConsecutiveC(String name, String description, Proposition[] propositions) {
		super(name, description);
this.propositions = propositions;
}

	public Proposition[] getAtomicPropositions() {
return propositions;
	}
}
