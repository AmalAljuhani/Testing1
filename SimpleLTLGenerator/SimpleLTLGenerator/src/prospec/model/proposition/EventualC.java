package prospec.model.proposition; 


public class EventualC extends CompositePropositions {

	public EventualC(String name, String description, Proposition[] propositions) {
		super(name, description);
this.propositions = propositions;
}

	public Proposition[] getAtomicPropositions() {
return propositions;
	}
}
