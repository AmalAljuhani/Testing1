package prospec.model.proposition;


public class ParallelE extends CompositePropositions {

	public ParallelE(String name, String description, Proposition[] propositions) {
		super(name, description);
this.propositions=propositions;
}

	public Proposition[] getAtomicPropositions() {
return propositions;
	}

}
