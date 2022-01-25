package com.bridgelab.basic;
import java.util.*;
import com.bridge.utility.*;
public class Quetient_Reminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a diviser and divident");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int quesent=Utility.quesent(num1, num2, 1);
		int reminder=Utility.quesent(num1, num2, 0);
		System.out.println("The Quesient : "+quesent+"   The Reminder : "+reminder);
	}

}
