package prospec.model.proposition;

public class ConsecutiveE extends CompositePropositions {

	public ConsecutiveE(String name, String description, Proposition[] propositions) {
		super(name, description);
this.propositions = propositions;
}

	public Proposition[] getAtomicPropositions() {
return propositions;
	}

}
