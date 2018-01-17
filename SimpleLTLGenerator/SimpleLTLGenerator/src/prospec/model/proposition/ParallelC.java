package prospec.model.proposition;


public class ParallelC extends CompositePropositions {

	public ParallelC(String name, String description, Proposition[] propositions) {
		super(name, description);
this.propositions=propositions;
}

	public Proposition[] getAtomicPropositions() {
return propositions;
	}
}
