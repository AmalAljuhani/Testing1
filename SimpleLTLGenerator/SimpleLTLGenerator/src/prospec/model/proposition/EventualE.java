package prospec.model.proposition; 


public class EventualE extends CompositePropositions {

	public EventualE(String name, String description, Proposition[] propositions) {
		super(name, description);
this.propositions = propositions;
}

	public Proposition[] getAtomicPropositions() {
return propositions;
	}
}
