package com.bridgelab.basic;
import java.util.*;
import com.bridge.utility.*;
public class Swap {
	
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	int num1=0,num2=0;
	System.out.println("enter two number num1 num2 :");
	num1=scanner.nextInt();
	num2=scanner.nextInt();
	System.out.println(" num1 = "+num1+"  num2 = "+num2);
	int arr[]=new int[2];
	arr=Utility.swap(num1, num2);
	int snum1=arr[0];
	int snum2=arr[1];
	System.out.println("the swaped number num1 = "+snum1+"  num2 = "+snum2);

	}
}