package com.bridgelab.basic;
import java.util.*;
import com.bridge.utility.*;
public class FLip_coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int head=0,tails=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of times we flip coins :  ");
		int times=scanner.nextInt();
		for(int i=0;i<times;i++) {
		if(Math.round(Math.random())==1)
			head+=1;
		else
			tails+=1;

		}
	System.out.println("Tails "+tails+"head : "+head);
	int per_head=Utility.percent(head, times);
	int per_tails=Utility.percent(tails, times);
	System.out.println("The Percentage of heads = :  "+per_head);
	System.out.println("The Percentage of tails = :  "+per_tails);
	scanner.close();
	}

}
