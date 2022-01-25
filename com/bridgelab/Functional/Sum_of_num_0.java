package com.bridgelab.Functional;
import java.util.*;
import com.bridge.utility.*;
public class Sum_of_num_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the limit of array :  ");
		int lim=sc.nextInt();
		System.out.println("Enter the array elements  :  ");
		int[] arr=new int[lim];
		for(int i=0;i<lim;i++)
			arr[i]=sc.nextInt();
		Utility.Sum_of_3(arr, lim);
			
	}

}
