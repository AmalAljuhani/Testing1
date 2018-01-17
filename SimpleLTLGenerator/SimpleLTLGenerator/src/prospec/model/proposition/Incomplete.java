package prospec.model.proposition; 

public class Incomplete extends CompositePropositions {
	
	public Incomplete (String name, String description, Proposition[] propositions) 
	{
		super(name, description);
this.propositions = propositions;
}
}
