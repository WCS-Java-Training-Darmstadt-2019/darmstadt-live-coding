package com.wcs.java.basics.vars;


public class VarsMain {
	
	public static void main(String[] args) {
		
		// I check if the values are passed by reference or by value
		VarsExamples.passByReferenceOrValue();
		
		// Overshadow
		VarsExamples e = new VarsExamples("David");
		e.setOvershadowedMemberVar("Shadow");
		System.out.println("I passed Shadow to the member variable but is it set? " +  e.overShadowedMemberVar);
	}
	
	

}
