package com.InnerClassInit;

import java.util.ArrayList;

public class Gearbox {
	private ArrayList<Gear> gears;
	private int maxgears;
	private int gearNumber = 0;
	private boolean clutchIsIn;
	private int currentGear = 0;

	public Gearbox(int maxgears) {
		this.maxgears = maxgears;
		this.gears = new ArrayList<Gear>();
		Gear neutral = new Gear(0,0.0);
		this.gears.add(neutral);

		for(int i=0; i<maxgears; i++) {
			addGear(i, i*5.3);
		}
	}

	public void operateClutch(boolean in) {
		this.clutchIsIn = in;
	}

	public void addGear(int number, double ratio) {
		if(number>0&&number<=maxgears) {
			this.gears.add(new Gear(number,ratio));
		}
	}

	public void changeGear(int newGear) {
		if(newGear>=0&&newGear<gears.size()&&this.clutchIsIn) {
			this.currentGear = newGear;
			System.out.println("Gear "+newGear+" selected");
		} else {
			System.out.println("VVVrrrrrrroooommmmm...!!!!!!!!");
			this.currentGear = 0;
		}
	}

	public double wheelSpeed(int revs) {
		if(clutchIsIn) {
			System.out.println("Vrroom in full clutch");
			return 0.0;
		} else {
			return revs*gears.get(currentGear).getRatio();
		}
	}

	private class Gear {  // This class is inside the gearbox class. Makes sense as gears are inside gearbox
		private int gearNumber;
		private double ratio;

		public Gear(int gearNumber, double ratio) {
			this.gearNumber = gearNumber; //gearNumber of this class (Gear)
			this.ratio = ratio;
		}

		public double driveSpeed(int revs) {
			return revs*this.ratio;
		}

		public double getRatio() {
			return ratio;
		}
	}
}
