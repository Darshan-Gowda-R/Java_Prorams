package com.bridgelab.JUnit_Testing;
import java.util.*;
public class Notes_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount u want to convert to change : ");
		int cur=sc.nextInt();
		int n1000=0,n500=0,n100=0,n50=0,n10=0,n5=0,n2=0,n1=0;
		if(cur>=1000) {
			n1000=cur/1000;
			cur=cur%1000;
		}
		if(cur>=500) {
			n500=1;
			cur=cur%500;
		}
		if(cur>=100) {
			n100=cur/100;
			cur=cur%100;
		}
		if(cur>=50) {
			n50=1;
			cur=cur%50;
		}
		if(cur>=10) {
			n10=cur/10;
			cur=cur%10;
		}
		if(cur>=5) {
			n5=1;
			cur=cur%5;
		}
		if(cur>=2) {
			n2=cur/2;
			cur=cur%2;
		}
		if(cur>=1) {
			n1=1;
			
		}
		
		System.out.println("the total number of nots required is "+ (n1000+n500+n100+n50+n10+n5+n2+n1));
		System.out.println("1000 : "+n1000+"\n500 : "+n500+"\n100 : "+n100+"\n50  : "+n50+"\n10 : "+n10+"  \n5 : "+n5+" \n2 : "+n2+"  \n1 : "+n1);
		sc.close();
	}

}
