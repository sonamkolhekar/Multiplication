package com.example;

public class Multi {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println("Multiplicatiin : " + (a * b));
		a = 20;
	    b = 20;
		System.out.println("Multiplicatiin : " + (a * b));
        //Added from github central
		 a = 50;
		 b = 60;
		System.out.println("Multiplicatiin : " + (a * b));
		//added from eclips
		a = 70;
	    b = 80;
		System.out.println("Multiplicatiin : " + (a * b));
		//Added from github by abhijeet--this is conflict example
		int a = 100;
		int b = 100;
		System.out.println("Multiplicatiin : " + (a * b));
	}

}
