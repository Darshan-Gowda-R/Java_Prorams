package com.bridgelab.Logical_program;
import java.util.*;
//import java.time.Instant;
import java.time.*;
public class Stop_watch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long start=0,stop=0;
		System.out.println("Enter 1 to start time coount : ");
		Scanner sc=new Scanner(System.in);
		int st=sc.nextInt();
		if(st==1) {
			Instant start=Instant.now();
			System.out.println("Enter 0 to stop time count : ");
			int op=sc.nextInt();
			if(op==0) {
				//stop =System.currentTimeMillis();
				Instant stop=Instant.now();
				Duration time=Duration.between(start, stop);
				System.out.println("the time difference between the action is : "+ time.toSeconds() +"  ms");
			}
		
		}
		sc.close();
	}

}
