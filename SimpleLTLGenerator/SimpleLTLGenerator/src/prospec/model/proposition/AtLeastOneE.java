package prospec.model.proposition;



public class AtLeastOneE extends CompositePropositions {

	public AtLeastOneE(String name, String description, Proposition[] propositions) {
		super(name, description);
this.propositions = propositions;
}

	public Proposition[] getAtomicPropositions() {
return propositions;
	}

}
