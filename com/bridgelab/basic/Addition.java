package com.bridgelab.basic;

import com.bridge.utility.*;
import java.util.Scanner;

import com.bridge.utility.Utility;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int number1=scanner.nextInt();
		System.out.println("Enter second number : ");
		int number2=scanner.nextInt();
		int sum=Utility.addition(number1, number2);
		System.out.println("The sum is : "+sum);
	}

}
