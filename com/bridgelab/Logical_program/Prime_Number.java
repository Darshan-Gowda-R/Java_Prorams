package com.bridgelab.Logical_program;
import java.util.*;
import com.bridge.utility.*;
public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check weather it's a prime or not :");
		int num=sc.nextInt();
		Logical_Programing_Code.Prime_num(num);
		sc.close();
	}

}
