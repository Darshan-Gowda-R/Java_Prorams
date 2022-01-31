package com.bridge.utility;

public class JUnit {
	public static void dayOfWeak(int m,int d,int y) {
		
		int y1,m1,x,d1;
		
		y1=y - (14-m)/12;
		x=y1 + (y1/4) - (y1/100) + (y1/400);
		m1=m + (12*((14-m)/12) -2);
		d1=(d+ x + (31*m1 / 12))%7;
		
		System.out.println("the day is : " +d1);
	}
	
	
	public static void Temp_convertion(int ch,double temp) {
		double ans=0.0f;
		if(ch==0) {
			ans=(temp*(9.0/5.0) + 32);
			System.out.println("Celsius to Fahrenheit : " +ans);
		}else {
			ans=(temp-32)*(5.0/9.0);
			System.out.println("Fahrenheit Celsius to : " +ans);
		}
	}
	
	
	public static void montlyPayment(double P,double Y ,double R) {
		double payment=0.0,r=0.0;//up=0.0,down=0.0;
		r=(R/(12*100));
		
		//up=P*r;
		//down=1 - (Math.pow(1+r, -12));
		payment=((P*r)/(1- Math.pow(1+r,(-12))));
		//System.out.println(r+"\n"+up+"\n"+down);
		System.out.println(" the monthly payment of "+ Math.round(payment));
	}
	
	
	
	public static void Sqrt(int num,double tol) {
		
		double x=num,root;
		
		while (true) {
			root=0.5*(x+( num/x ));
			if(Math.abs(root-x)<tol)
				break;
			x=root;
		}
		System.out.println("Square Root "+root);
	}
	
	
	
	
	public static String toBinary(int num) {
		//int temp=0,num1=num;
		String dig="";
		while(num>0) {
			if(num%2==0)
				dig="0"+dig;
			else
				dig="1"+dig;
			//System.out.println(digit);
			num=num/2;
			
		}
		return dig;
		/*
		//System.out.println(dig);;
		dig=dig+"1";
		String digit="";
		for(int i=0;i<dig.length()-1;i++) {
			char a=dig.charAt(i);
			if (a=='0')
				digit="0"+digit;
			else
				digit="1"+digit;
			//System.out.println("digit : "+digit);
		}
		//System.out.println("final " + digit);
		return digit; */
	}
	
	
	
	
	
	
}
