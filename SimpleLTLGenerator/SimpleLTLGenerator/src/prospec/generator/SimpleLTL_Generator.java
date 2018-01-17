package prospec.generator; 
import prospec.model.pattern.Absence;
import prospec.model.pattern.Existence;
import prospec.model.pattern.Precedence;
import prospec.model.pattern.Response;
import prospec.model.pattern.StrictPrecedence;
import prospec.model.pattern.Universality;
import prospec.model.property.Property;
import prospec.model.scope.AfterL;
import prospec.model.scope.AfterLuntilR;
import prospec.model.scope.BeforeR;
import prospec.model.scope.BetweenLandR;
import prospec.model.scope.Global;

public class SimpleLTL_Generator extends Generator{

	private String generateUniversalityAfterLuntilR(Property P) {
	       
return "[]((" + ((AfterLuntilR)P.getScope()).getL().getName() + " AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ")->(¬((" + ((Universality)P.getPattern()).getP().getName() + " AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ") U ((¬" + ((Universality)P.getPattern()).getP().getName() + ") AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + "))))";
	}
	
	private String generateUniversalityAfterL(Property P) {
		     
return "¬((¬" + ((AfterL)P.getScope()).getL().getName() + ") U (" + ((AfterL)P.getScope()).getL().getName() + " AND <>¬" + ((Universality)P.getPattern()).getP().getName() + "))";
	}
	
	private String generateAbsenceAfterL(Property P) {
		   
return "¬((¬" + ((AfterL)P.getScope()).getL().getName() + ") U (" + ((AfterL)P.getScope()).getL().getName() + " AND <>" + ((Absence)P.getPattern()).getP().getName() + "))";
	}
	
	private String generateAbsenceAfterLuntilR(Property P) {
	       
return "[](" + ((AfterLuntilR)P.getScope()).getL().getName() + " AND ¬(" + ((AfterLuntilR)P.getScope()).getR().getName() + ")->¬(¬(" + ((AfterLuntilR)P.getScope()).getR().getName() + ") U " + ((Absence)P.getPattern()).getP().getName() + "))";
	}
	
	private String generateExistenceAfterL(Property P) {
	       
return "¬((¬" + ((AfterL)P.getScope()).getL().getName() + ") U (" + ((AfterL)P.getScope()).getL().getName() + " AND ¬<>" + ((Existence)P.getPattern()).getP().getName() + "))";
	}
	
	private String generatePrecedenceAfterL(Property P) {
	       
return "¬((¬" + ((AfterL)P.getScope()).getL().getName() + ") U (" +  ((AfterL)P.getScope()).getL().getName() + " AND ((¬" + ((Precedence)P.getPattern()).getQ().getName() + ") U (" + ((Precedence)P.getPattern()).getP().getName() + " AND ¬" + ((Precedence)P.getPattern()).getQ().getName() + "))))";
	}
	
	private String generatePrecedenceAfterLuntilR(Property P) {
	       
return "[]((" + ((AfterLuntilR)P.getScope()).getL().getName() + " AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ")->(¬(((¬" + ((Precedence)P.getPattern()).getQ().getName() + ") AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ") U (" + ((Precedence)P.getPattern()).getP().getName() + " AND (¬" + ((Precedence)P.getPattern()).getQ().getName() + ") AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ")))";
	}
	
	private String generateResponseAfterL(Property P) {
	       
return "¬((¬" + ((AfterL)P.getScope()).getL().getName() + ") U (" + ((AfterL)P.getScope()).getL().getName() + " AND (¬[](" + ((Response)P.getPattern()).getP().getName() + "-><>" + ((Response)P.getPattern()).getQ().getName() + "))))";
	}
	
	private String generateResponseAfterLuntilR(Property P) {
	       
return "[]((" + ((AfterLuntilR)P.getScope()).getL().getName() + " AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ")->¬((¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ") U (" + ((Response)P.getPattern()).getP().getName() + " AND (¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ") AND (([]((¬" + ((Response)P.getPattern()).getQ().getName() + ") AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ")) OR ((¬" + ((Response)P.getPattern()).getQ().getName() + ") U " + ((AfterLuntilR)P.getScope()).getR().getName() + "))))))";
	}
	
	private String generateStrictPrecedenceAfterL(Property P) {
	       
return "¬((¬" + ((AfterL)P.getScope()).getL().getName() + ") U (" + ((AfterL)P.getScope()).getL().getName() + " AND ((¬(" + ((StrictPrecedence)P.getPattern()).getQ().getName() + " AND ¬" + ((StrictPrecedence)P.getPattern()).getP().getName() + ")) U " + ((StrictPrecedence)P.getPattern()).getP().getName() + ")))";
	}
	
	private String generateStrictPrecedenceAfterLuntilR(Property P) {
	       
return "¬<>(" + ((AfterLuntilR)P.getScope()).getL().getName() + " AND (¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ") AND (((¬" + ((StrictPrecedence)P.getPattern()).getQ().getName() + ") AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ") U (" +((StrictPrecedence)P.getPattern()).getP().getName() + " AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ")))";
	}
	
	private String generateExistenceBeforeR(Property P) {
	       
return "¬((¬" + ((Existence)P.getPattern()).getP().getName() + ") U " + ((BeforeR)P.getScope()).getR().getName() + ")";
	}
	
	private String generateExistenceBetweenLandR(Property P) {
	       
return "[]((" + ((BetweenLandR)P.getScope()).getL().getName() + " AND ¬" + ((BetweenLandR)P.getScope()).getR().getName() + ")->(¬((¬" +	((Existence)P.getPattern()).getP().getName() + ") U " + ((BetweenLandR)P.getScope()).getR().getName() + ")))";
	}
	
	private String generateResponseBeforeR(Property P) {
	       
return "¬((¬" + ((BeforeR)P.getScope()).getR().getName() + ") U (" + ((Response)P.getPattern()).getP().getName() + " AND (¬" + ((BeforeR)P.getScope()).getR().getName() + ") AND ((¬" + ((Response)P.getPattern()).getQ().getName() + ") U " + ((BeforeR)P.getScope()).getR().getName() + ")))";
	}
	
	private String generateResponseBetweenLandR(Property P) {
	       
return "[]((" + ((BetweenLandR)P.getScope()).getL().getName() + " AND ¬" + ((BetweenLandR)P.getScope()).getR().getName() + ")->¬((¬" + ((BetweenLandR)P.getScope()).getR().getName() + ") U (" + ((Response)P.getPattern()).getP().getName() + " AND (¬" + ((BetweenLandR)P.getScope()).getR().getName() + ") AND ((¬" + ((Response)P.getPattern()).getQ().getName() + ") U " +	((BetweenLandR)P.getScope()).getR().getName() + "))))";
	}
	
	private String generateStrictPrecedenceBetweenLandR(Property P) {
	       
return "[]((" + ((BetweenLandR)P.getScope()).getL().getName() + " AND ¬" + ((BetweenLandR)P.getScope()).getR().getName() + ")->(¬(((¬(" + ((StrictPrecedence)P.getPattern()).getQ().getName() + " AND ¬" + ((StrictPrecedence)P.getPattern()).getP().getName() + ")) AND ¬" + ((BetweenLandR)P.getScope()).getR().getName() + ") U (" + ((StrictPrecedence)P.getPattern()).getP().getName() + " AND (¬(" + ((StrictPrecedence)P.getPattern()).getQ().getName() + " AND ¬" + ((StrictPrecedence)P.getPattern()).getP().getName() + ")) AND (¬" + ((BetweenLandR)P.getScope()).getR().getName() + ") AND <>" + ((BetweenLandR)P.getScope()).getR().getName() + "))))";
	}
	
	private String generatePrecedenceGlobal(Property P) {
	       
return "¬((¬" + ((Precedence)P.getPattern()).getQ().getName() + ") U (" + ((Precedence)P.getPattern()).getP().getName() + " AND ¬" + ((Precedence)P.getPattern()).getQ().getName() + "))";
	}
	
	private String generateStrictPrecedenceGlobal(Property P) {
	       
return "¬((¬" + ((StrictPrecedence)P.getPattern()).getQ().getName() + " AND ¬" + ((StrictPrecedence)P.getPattern()).getP().getName() + ") U " + ((StrictPrecedence)P.getPattern()).getP().getName() + ")";
	}
	
	private String generateAbsenceGlobal(Property P) {
	       
return "¬(<>" + ((Absence)P.getPattern()).getP().getName() + ")";
	}
	
	private String generateAbsenceBeforeR(Property P) {
	       
return "<>" + ((BeforeR)P.getScope()).getR().getName() + "->¬(¬(" + ((BeforeR)P.getScope()).getR().getName() + ") U " + ((Absence)P.getPattern()).getP().getName() + ")";
	}
	
	private String generateAbsenceBetweenLandR(Property P) {
	       
return "[]((" + ((BetweenLandR)P.getScope()).getL().getName() + " AND ¬(" + ((BetweenLandR)P.getScope()).getR().getName() + ") AND <>" + ((BetweenLandR)P.getScope()).getR().getName() + ")->¬(¬(" + ((BetweenLandR)P.getScope()).getR().getName() + ") U " + ((Absence)P.getPattern()).getP().getName() +"))";
	}
	
	private String generateExistenceGlobal(Property P) {
	       
return "(<>" + ((Existence)P.getPattern()).getP().getName() + ")";
	}
	
	private String generateExistenceAfterLuntilR(Property P) {
	       
return "[]((" + ((AfterLuntilR)P.getScope()).getL().getName() + " AND ¬(" + ((AfterLuntilR)P.getScope()).getR().getName() + "))->(¬(" + ((AfterLuntilR)P.getScope()).getR().getName() + ") U (" + ((Existence)P.getPattern()).getP().getName() + " AND ¬(" + ((AfterLuntilR)P.getScope()).getR().getName() + "))))";
	}
	
	private String generateUniversalityGlobal(Property P) {
	       
return "[]" + ((Universality)P.getPattern()).getP().getName();
	}
	
	private String generateUniversalityBeforeR(Property P) {
	       
return "<>" + ((BeforeR)P.getScope()).getR().getName() + "->(" + ((Universality)P.getPattern()).getP().getName() + " U " + ((BeforeR)P.getScope()).getR().getName() + ")";
	}
	
	private String generateUniversalityBetweenLandR(Property P) {
	       
return "[]((" + ((BetweenLandR)P.getScope()).getL().getName() + " AND ¬(" + ((BetweenLandR)P.getScope()).getR().getName() + ") AND <>" + ((BetweenLandR)P.getScope()).getR().getName() + ")->(" + ((Universality)P.getPattern()).getP().getName() + " U " + ((BetweenLandR)P.getScope()).getR().getName() +"))";
	}
	
	private String generatePrecedenceBeforeR(Property P) {
	       
return "<>" + ((BeforeR)P.getScope()).getR().getName() + "->(¬(" + ((Precedence)P.getPattern()).getP().getName() + ") U (" + ((Precedence)P.getPattern()).getQ().getName() + " OR " + ((BeforeR)P.getScope()).getR().getName() + "))";
	}
	
	private String generatePrecedenceBetweenLandR(Property P) {
	       
return "[]((" + ((BetweenLandR)P.getScope()).getL().getName() + " AND ¬(" + ((BetweenLandR)P.getScope()).getR().getName() + ") AND <>" + ((BetweenLandR)P.getScope()).getR().getName() + ")->(¬(" + ((Precedence)P.getPattern()).getP().getName() + ") U ((" + ((Precedence)P.getPattern()).getQ().getName() +" OR " + ((BetweenLandR)P.getScope()).getR().getName() + ")))";
	}
	
	private String generateStrictPrecedenceBeforeR(Property P) {
	       
return "<>" + ((BeforeR)P.getScope()).getR().getName() + "->(¬(" + ((StrictPrecedence)P.getPattern()).getP().getName() + ") U ((" + ((StrictPrecedence)P.getPattern()).getQ().getName() + " AND ¬(" + ((StrictPrecedence)P.getPattern()).getP().getName() + ")) OR " + ((BeforeR)P.getScope()).getR().getName() + "))";
	}
	
	private String generateResponseGlobal(Property P) {
	       
return "[](" + ((Response)P.getPattern()).getP().getName() + " -> <>" + ((Response)P.getPattern()).getQ().getName() + ")";
	}	
	
	public String getStringRepresentation(Property P)
	{
if (P.getPattern() instanceof Universality)
		{
return generateUniversalityScope(P);
		}
		else
		{
if (P.getPattern() instanceof StrictPrecedence)
			{
return generateStrictPrecedenceScope(P);
			}
			else
			{
if (P.getPattern() instanceof Response)
				{
return generateResponseScope(P);
				}
				else
				{
if (P.getPattern() instanceof Precedence)
					{
return generatePrecedenceScope(P);
					}
					else
					{
if (P.getPattern() instanceof Existence)
						{
return generateExistenceScope(P);
						}
						else
						{
if (P.getPattern() instanceof Absence)
							{
return generateAbsenceScope(P);
							}
							else
							{
return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
							}
						}
					}
				}
			}
		}
	}

	private String generateUniversalityScope(Property P) {
if (P.getScope() instanceof Global)
		{
return generateUniversalityGlobal(P);
		}
		else
		{
if (P.getScope() instanceof BetweenLandR)
			{
return generateUniversalityBetweenLandR(P);
			}
			else
			{
if (P.getScope() instanceof BeforeR)
				{
return generateUniversalityBeforeR(P);
				}
				else
				{
if (P.getScope() instanceof AfterLuntilR)
					{
return generateUniversalityAfterLuntilR(P);
					}
					else
					{
if (P.getScope() instanceof AfterL)
						{
return generateUniversalityAfterL(P);
						}
						else
						{
return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
						}
					}
				}
			}
		}
	}

	private String generateStrictPrecedenceScope(Property P) {
if (P.getScope() instanceof Global)
		{
return generateStrictPrecedenceGlobal(P);
		}
		else
		{
if (P.getScope() instanceof BetweenLandR)
			{
return generateStrictPrecedenceBetweenLandR(P);
			}
			else
			{
if (P.getScope() instanceof BeforeR)
				{
return generateStrictPrecedenceBeforeR(P);
				}
				else
				{
if (P.getScope() instanceof AfterLuntilR)
					{
return generateStrictPrecedenceAfterLuntilR(P);
					}
					else
					{
if (P.getScope() instanceof AfterL)
						{
return generateStrictPrecedenceAfterL(P);
						}
						else
						{
return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
						}
					}
				}
			}
		}
	}

	private String generateResponseScope(Property P) {
if (P.getScope() instanceof Global)
		{
return generateResponseGlobal(P);
		}
		else
		{
if (P.getScope() instanceof BetweenLandR)
			{
return generateResponseBetweenLandR(P);
			}
			else
			{
if (P.getScope() instanceof BeforeR)
				{
return generateResponseBeforeR(P);
				}
				else
				{
if (P.getScope() instanceof AfterLuntilR)
					{
return generateResponseAfterLuntilR(P);
					}
					else
					{
if (P.getScope() instanceof AfterL)
						{
return generateResponseAfterL(P);
						}
						else
						{	
return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
						}
					}
				}
			}
		}
	}

	private String generatePrecedenceScope(Property P) {
if (P.getScope() instanceof Global)
		{
return generatePrecedenceGlobal(P);
		}
		else
		{
if (P.getScope() instanceof BetweenLandR)
			{
return generatePrecedenceBetweenLandR(P);
			}
			else
			{
if (P.getScope() instanceof BeforeR)
				{
return generatePrecedenceBeforeR(P);
				}
				else
				{
if (P.getScope() instanceof AfterLuntilR)
					{
return generatePrecedenceAfterLuntilR(P);
					}
					else
					{
if (P.getScope() instanceof AfterL)
						{
return generatePrecedenceAfterL(P);
						}
						else
						{
return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
						}
					}
				}
			}
		}
	}

	private String generateExistenceScope(Property P) {
if (P.getScope() instanceof Global)
		{
return generateExistenceGlobal(P);
		}
		else
		{
if (P.getScope() instanceof BetweenLandR)
			{
return generateExistenceBetweenLandR(P);
			}
			else
			{
if (P.getScope() instanceof BeforeR)
				{
return generateExistenceBeforeR(P);
				}
				else
				{
if (P.getScope() instanceof AfterLuntilR)
					{
return generateExistenceAfterLuntilR(P);
					}
					else
					{
if (P.getScope() instanceof AfterL)
						{
return generateExistenceAfterL(P);
						}
						else
						{
return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
						}
					}
				}
			}
		}
	}

	private String generateAbsenceScope(Property P) {
if (P.getScope() instanceof Global)
		{
return generateAbsenceGlobal(P);
		}
		else
		{
if (P.getScope() instanceof BetweenLandR)
			{
return generateAbsenceBetweenLandR(P);
			}
			else
			{
if (P.getScope() instanceof BeforeR)
				{
return generateAbsenceBeforeR(P);
				}
				else
				{
if (P.getScope() instanceof AfterLuntilR)
					{
return generateAbsenceAfterLuntilR(P);
					}
					else
					{
if (P.getScope() instanceof AfterL)
						{
return generateAbsenceAfterL(P);
						}
						else
						{
return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
						}
					}
				}
			}
		}
	}
}
