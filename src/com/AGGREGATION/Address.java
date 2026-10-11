package com.AGGREGATION;

public class Address {
	
  String name;
  String state;
  String country;  
  
  @Override
public String toString() {
	return "Address [name=" + name + ", state=" + state + ", country=" + country + "]";
}

  public Address(String name, String state, String country) {
	super();
	this.name = name;
	this.state = state;
	this.country = country;
  }
}



