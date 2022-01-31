package com.bridgelab.JUnit_Testing;
import java.util.*;
import com.bridge.utility.*;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valve : ");
		int num=sc.nextInt();
		String bin=JUnit.toBinary(num);
		//int bin_number=Integer.parseInt(bin);
		int len=bin.length();
		if(len<8) {
			for(int i=len;i<8;i++)
				bin="0"+bin;
		}
		System.out.println(bin);
		String str1,str2;
		str1=(bin.substring(4));
		str2=(bin.substring(0, 4));
		String bin_final=str1+str2;
		System.out.println(bin_final);
		int bin_int=0;
		
		for(int i=1;i<=8;i++) {
			char ch=bin_final.charAt(i-1);
			if(ch == '1' ) {
				int pow=1;
				for(int j=1;j<=i;j++)
					pow=(2*pow);
				
				
				bin_int=bin_int+pow;
//				System.out.println(i);
//				System.out.println(pow);
				}
				
			
		}
		
		
		System.out.println("The value in integer : " +bin_int);
		
		sc.close();
		
		
	}

}
