package com.AbstractionInit;

public class Parrot extends Bird implements CanFly {

	public Parrot(String name) {
		super(name);
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println(getName() + " is Flying high");
	}
}
