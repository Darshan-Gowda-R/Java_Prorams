package com.bridgelab.JUnit_Testing;
import com.bridge.utility.*;
public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double p,r,y;
	p=Double.parseDouble(args[0]);
	y=Double.parseDouble(args[1]);
	r=Double.parseDouble(args[2]);
	JUnit.montlyPayment(p, y, r);
		
	}

}
