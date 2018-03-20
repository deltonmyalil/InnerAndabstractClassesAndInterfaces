package com.InterfaceTrial;

public class Main {

    public static void main(String[] args) {
	ITelephone deltonsPhone = new DeskPhone(2229990);
	deltonsPhone.powerOn();
	deltonsPhone.callPhone(2229990);
	deltonsPhone.answer();

	deltonsPhone = new MobilePhone(8891368); //Now deltonsPhone is an object of a different class
		// and it does not give an error because it implements the same interface
	deltonsPhone.powerOn();
	deltonsPhone.callPhone(8891368);
	deltonsPhone.answer();

    }
}
