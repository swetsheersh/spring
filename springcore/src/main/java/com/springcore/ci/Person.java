package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	public Person(String name,int personId,Certi certi) {
		this.name=name;
		this.personId=personId;
		this.certi=certi;
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" : " +this.personId+"{ "+this.certi.name+" }";
	}
}
