package com.InnerClassInit;

public class Main {
	public static void main(String[] args) {
		Gearbox mcLaren = new Gearbox(6);  //outer class
//		Gearbox.Gear first = mcLaren.new Gear(1, 12.3);  //Inner class
//		//You need an outer class object to create an instance of inner class. Shown above
//		System.out.println(first.driveSpeed(1000));
		//The above code is when the inner class is public

		//The following when the inner class is private
//		mcLaren.addGear(1,5.3); //use the add gear method
//		mcLaren.addGear(2,10.6);
//		mcLaren.addGear(3,15.9);

		mcLaren.operateClutch(true);
		mcLaren.changeGear(1);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
		mcLaren.changeGear(2);
		System.out.println(mcLaren.wheelSpeed(3000));
		mcLaren.operateClutch(true);
		mcLaren.changeGear(3);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(6000));
	}
}
