package com.bridgelab.basic;
import java.util.*;
import com.bridge.utility.*;
public class Harmonic {
	public static void main(String[] args) {
	double har=0.0d;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number for harmonic number ");
	int n=scanner.nextInt();
	if(n!=0) {
		har=Utility.harmonic(n);
		System.out.println("Harmonic value : "+har);
	}else
		System.out.println("U have entered 0 ");
	scanner.close();
	}

}