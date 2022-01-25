package com.bridgelab.basic;
import java.util.*;
import com.bridge.utility.*;
public class Largest_of_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		System.out.println("enter 3 numbers :");
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		int max=Utility.max_3_number(num1, num2, num3);
		System.out.println("The MAX number is : "+max);
	}

}
