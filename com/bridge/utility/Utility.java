package com.bridge.utility;

public class Utility {

	public static int addition(int number1,int number2) {
		return number1+number2;
	}
	
	public static int multiplication(int number1,int number2) {
		
	return number1*number2;
	
	}
	
	public static int percent(int num,int total) {
		float per=(float)num/(float)total;
		per=per*100;
		int fin=Math.round(per);
		return fin;
	
	}
	
	public static boolean leap_year(int year) {
		if(year%4==0 || (year%100==0 && year%400==0))
			return true;
		return false;
	}
	public static int power(int num,int till) {
		int pow=1;
		for(int i=0;i<till;i++) 
			pow*=num;
		
		return pow;
	}
	
	public static double harmonic(int num) {
		double har=0.0;
		for(float i=1;i<=num;i++) {
			
			har+=1/i;
			System.out.println(har);
		}
		return har;
	}
	
	
	public static int prime_factors(int num) {
		int count=0;
		for (int j=1;j<=num;j++) {
			if(num%j==0)
				count++;
		}
		if(count==2)
			return 1;
		return 0;
	}
	public static int quesent(int num1,int num2,int num3) {
		if(num3==1)
			return num1/num2;
		return num1%num2;
	//System.out.println("Enter a character ");
	
}
	
	public static int[] swap(int num1,int num2) {
		int ar[]=new int[] {num2,num1}; 
		return ar;
	}
	public static int even(int num) {
		return (num%2==0)?1:0;
	}
	public static int ovel(char ch) {
		if(ch == 'a' || ch =='A'||ch == 'e' || ch =='E'||ch == 'i' || ch =='I'||ch == 'o' || ch =='O'||ch == 'u' || ch =='U')
			return 1;
		return 0;
	}
	public static int max_3_number(int num1,int num2,int num3) {
		if(num1 >= num2 && num1 >= num3)
			return num1;
		else if(num2>num1 && num2>num3)
			return num2;
		
		else
			return num3;
	}
	//
	
	
	
	// 		FUNCTIONAL PROGRAM !
	
	
	
	//
	
	public static void print_arr(int row,int col,int[][] arr) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				System.out.print(arr[i][j]+"  ");
			System.out.println();
		}
	}
	
	
	
	public static void Sum_of_3(int[] arr,int lim) {
		int count=0;
		for(int i=0;i<lim-2;i++)
			for(int j=0;j<lim;j++) {
				if(j!=i)
					for(int k=0;k<lim;k++) {
						if(k!=i && k!=j) {
							int sum=0; 
							sum=arr[i] + arr[j] + arr[k];
							if(sum==0) {
								count++;
								System.out.println("The three numbers whoes sum = 0 are "+arr[i]+arr[j]+arr[k]);
							}
						}
					}
			}
			
		if (count==0)
			System.out.println("There are no numbers that sum is 0 ");
	}
	
	
	
	public static void distance_origin_(int x,int y) {
		
		double dis=Math.sqrt((x*x)+(y*y));
		System.out.print("the distance between x and y from origin is : "+dis);
		
	}
	
	
	
	public static void quadratic(int a,int b,int c) {
		
		int delta=b*b - 4*a*c;
		double root1=Math.sqrt(delta)/(2*a);
		double root2=Math.sqrt(delta)/(2*a);
		root1=-b+root1;
		root2=-b-root2;
		System.out.println("Delta : "+delta);
		System.out.println("Root 1 of x = "+root1);
		System.out.println("Root 2 of x = "+root2);
	}
	
	
	
	
	public static void wind_chill(int a,int b,double t, double v) {
		double wind=0.0;
		if(t < 50 && v<120 && v>3) {
			wind=(0.4275*t - 35.75)*Math.pow(v, 0.16);
			wind+=35.74;
			wind+=0.6215*t;
			System.out.println("the wind chill is :"+wind);
		}else
			System.out.println("cannot calculate for this values : ");
	}
	
}


