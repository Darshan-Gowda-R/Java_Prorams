package com.bridgelab.JUnit_Testing;
import java.util.*;
import com.bridge.utility.*;
public class Sqrt_NonNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Number and toloresce level : ");
		int num=sc.nextInt();
		double tlo=sc.nextDouble();
		JUnit.Sqrt(num, tlo);
		sc.close();
	}

}
