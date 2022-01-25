package com.bridgelab.basic;
import java.util.*;
import com.bridge.utility.*;
public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 4 digit number to check weather its a leap year :  ");
		year=scanner.nextInt();
		int check=year,c = 0;
		while(check>0) {
			check=check/10;
			c++;
		}
		if(c==4) {
			boolean y=false;
			y=Utility.leap_year(year);
			System.out.println((y)?"It is Leap Year":"It is not Leap Year");
			
		}
		else
			System.out.println("wrong input");
	}

}
