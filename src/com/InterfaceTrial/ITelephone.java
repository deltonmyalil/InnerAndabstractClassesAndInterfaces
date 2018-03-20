package com.InterfaceTrial;

public interface ITelephone {
	void powerOn();  //Only declaration, not definition
	void dial(int phoneNumber); //definition goes into the class that inherits this interface
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();
}
