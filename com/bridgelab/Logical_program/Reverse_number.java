package com.bridgelab.Logical_program;
import java.util.*;
import com.bridge.utility.Logical_Programing_Code;
public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number to be reversed ");
	int num=sc.nextInt();
	int rev=Logical_Programing_Code.Reverse(num);
	System.out.println("The reversed number = "+rev);
	sc.close();
	}

}
