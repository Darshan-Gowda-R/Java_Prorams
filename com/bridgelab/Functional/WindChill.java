package com.bridgelab.Functional;
import java.util.*;
import com.bridge.utility.*;
public class WindChill {

	public static void main(String[] ar) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		double t=Double.parseDouble(ar[0]);
		double v=Double.parseDouble(ar[1]);
		Utility.wind_chill(a, b, t, v);
		
		sc.close();
	}

}
