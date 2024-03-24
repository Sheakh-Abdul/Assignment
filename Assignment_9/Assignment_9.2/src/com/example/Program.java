// 2 - Write a Java program to create a method that takes an integer as a parameter and
//		throws an exception if the number is odd.
package com.example;
import java.util.Scanner;
class OddException extends Exception {
	public OddException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}	
}

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a Number  = ");
		int num = sc.nextInt();
		try {
			numCheck(num);
			//throw new OddException("Odd Number is not Valid.");
		} catch (OddException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	private static void numCheck(int num) throws OddException {
		if (num%2 != 0)
			throw new OddException("Odd Number is not Valid.");
		System.out.println("Ok, Number is Even !");
	}	
}
