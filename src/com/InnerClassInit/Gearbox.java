package com.InnerClassInit;

import java.util.ArrayList;

public class Gearbox {
	private ArrayList<Gear> gears;
	private int maxgears;
	private int gearNumber = 0;

	public Gearbox(int maxgears) {
		this.maxgears = maxgears;
		this.gears = new ArrayList<Gear>();
		Gear neutral = new Gear(0,0.0);
		this.gears.add(neutral);
	}

	public class Gear {  // This class is inside the gearbox class. Makes sense as gears are inside gearbox
		private int gearNumber;
		private double ratio;

		public Gear(int gearNumber, double ratio) {
			this.gearNumber = gearNumber; //gearNumber of this class (Gear)
			this.ratio = ratio;
		}

		public double driveSpeed(int revs) {
			return revs*this.ratio;
		}
	}
}
