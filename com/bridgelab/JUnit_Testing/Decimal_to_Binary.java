package com.bridgelab.JUnit_Testing;
import java.util.*;
import com.bridge.utility.*;
public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit to convert to its binary value : ");
		int num=sc.nextInt();
		String bin=JUnit.toBinary(num);
		System.out.println(bin);
	
		sc.close();
	}

}
