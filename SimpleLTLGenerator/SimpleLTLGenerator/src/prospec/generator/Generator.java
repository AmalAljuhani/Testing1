package prospec.generator; 

import prospec.model.property.Property;

public abstract class Generator {
public boolean atomicL=false;
public boolean atomicR=false;
public boolean atomicP=false;
public boolean atomicQ=false;
public abstract String getStringRepresentation(Property P);
}
