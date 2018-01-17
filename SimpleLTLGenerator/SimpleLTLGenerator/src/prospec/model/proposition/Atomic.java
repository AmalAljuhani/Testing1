package prospec.model.proposition; 



public class Atomic extends Proposition {
	
	protected boolean polarity;
	
	public Atomic(String name, String description, Boolean polarity) {
		super(name, description);
this.polarity=polarity;
		
}
	public void setPolarity(boolean value){
this.polarity = value;
}
	public boolean getPolarity(){
return this.polarity;
	}
}
