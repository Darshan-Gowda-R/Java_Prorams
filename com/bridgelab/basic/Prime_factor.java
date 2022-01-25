package com.bridgelab.basic;
import java.util.*;
import com.bridge.utility.*;
public class Prime_factor {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find its prime factors :");
		int num=scanner.nextInt();
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				int r=Utility.prime_factors(i);
				
			if(r==1)
				System.out.println(i);
	
			}
		}
	
	}
}
