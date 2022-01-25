package com.bridgelab.basic;
import java.util.*;
import com.bridge.utility.*;
public class Power_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the N limit to print power of 2 ");
		int N=scanner.nextInt();
		if(N<=31) {
		for(int i=1;i<=N;i++) {
			int pow=Utility.power(2, i);
			System.out.println("2^"+i+"  =  "+pow);
		}
		}else
			System.out.println("the power limit excidis integer limit ");
	}

}
