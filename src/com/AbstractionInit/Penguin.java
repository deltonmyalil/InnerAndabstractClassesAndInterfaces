package com.AbstractionInit;

public class Penguin extends Bird {
	public Penguin(String name) {
		super(name);
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("I tried but cant fly");
	}
}
