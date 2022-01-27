package com.bridge.utility;

public class Logical_Programing_Code {

	
	public static void Fibonachi(int num) {
		int fib=1,prev=0,temp=0;
		int i=0;
		System.out.print(0+"  ");
		while(i<num-1) {
			System.out.print(fib+"  ");
			temp=fib;
			fib+=prev;
			prev=temp;
			i++;
			
		}
		
	}
	
	
	
	public static void Perfect_num(int num) {
		int count=0;
		for(int i=1;i<=num/2+1;i++) {
			if(num%i==0)
				count+=i;
		}
		if(count==num)
			System.out.println("IT's a PERFECT number");
		else
			System.out.println("IT's NOT a Perficet number");
	}
	
	
	
	
	public static void Prime_num(int num) {
		int count=0;
		for(int i=1;i<=num;i++)
			if(num%i==0)
				count++;
		if(count==2)
			System.out.println("Its a Prime Number");
		else
			System.out.println("Its not a Prime Number");
	}
	
	
	
	public static int  Reverse(int num) {
		
		int rev=0,temp=0;
		while(num>0) {
			temp=num%10;
			num=num/10;
			rev=rev*10 + temp;
		}
		return rev;
	}
	
}
