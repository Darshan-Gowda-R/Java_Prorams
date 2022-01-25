package com.bridgelab.basic;
import java.util.*;
import com.bridge.utility.*;
public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check even oe odd :");
		int num=scanner.nextInt();
		int result=Utility.even(num);
		if(result==1)
			System.out.println("it is an even number : "+num);
		else
			System.out.println("it is an odd number : "+num);
	}

}
