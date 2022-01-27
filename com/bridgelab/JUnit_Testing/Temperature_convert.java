package com.bridgelab.JUnit_Testing;
import java.util.*;
import com.bridge.utility.*;
public class Temperature_convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Temperature unit convertion enter \n0 for celices to fahrenheit \n1 for fahrenhite to celicus :");
		int ch=sc.nextInt();
		System.out.println("enter the temperature : ");
		double temp=sc.nextFloat();
		JUnit.Temp_convertion(ch, temp);
		sc.close();
	}

}
