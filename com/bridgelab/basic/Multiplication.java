package com.bridgelab.basic;

import com.bridge.utility.*;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int number1=scanner.nextInt();
		System.out.println("Enter second number : ");
		int number2=scanner.nextInt();
		int mul=Utility.multiplication(number1, number2);
		System.out.print("The product is : "+mul);
	}

}
