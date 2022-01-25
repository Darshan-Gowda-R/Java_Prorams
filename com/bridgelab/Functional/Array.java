package com.bridgelab.Functional;
import java.util.*;
import com.bridge.utility.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rows and columns of array to be initialized ");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int[][] arr=new int[row][col];
	System.out.println("enter the values here : ");
	for(int i=0;i<row;i++)
		for(int j=0;j<col;j++) {
			arr[i][j]=sc.nextInt();
		}
	Utility.print_arr(row, col, arr);
	
	}

}
