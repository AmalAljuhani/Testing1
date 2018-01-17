package prospec.model.proposition;



public class AtLeastOneC extends CompositePropositions {

	public AtLeastOneC(String name, String description, Proposition[] propositions) 
	{
		super(name, description);
this.propositions = propositions;
}
	
	public Proposition[] getAtomicPropositions() {
return propositions;
	}
}
