package com.bridgelab.Functional;
import java.util.*;
import com.bridge.utility.*;
public class Quadratic {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("enter three digit number : ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	Utility.quadratic(a, b, c);

	}

}
