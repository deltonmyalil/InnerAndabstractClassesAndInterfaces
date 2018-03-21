package com.AbstractionInit;

public abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	//Abstract methods only declared, not defined
	public abstract void eat();
	public abstract void breathe();

	public String getName() {
		return name;
	}

}

//Interface has only method declarations. Abstract class could also contain fields (name in this case)
//in addition to method declaration
//also, I added a getter
//also, regular methods could be added in an abstract class

//You cant instantiate an interface. Interface cannot have constructors.