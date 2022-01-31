package com.bridgelab.JUnit_Testing;




 class Abc {
	int a=10;
}



public class Pass_by_Reference {

	static public void change(Abc a) {
		
		a.a=100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Abc a=new Abc();
	System.out.println("the inetial vale : "+a.a);
	change(a);
	System.out.print("the final value : "+a.a);
	}

}
