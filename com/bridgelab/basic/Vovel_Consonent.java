package com.bridgelab.basic;
import java.util.*;
import com.bridge.utility.*;
public class Vovel_Consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character ");
		char check=scanner.next().charAt(0);
		int result=Utility.ovel(check);
		if(result==1)
			System.out.println("Entered character is a ovel : " +check);
		else
			System.out.println("Entered character is a consonent :  "+check);
	}

}
