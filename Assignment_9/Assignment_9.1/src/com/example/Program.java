// 1 - Write a Java program that throws an arithmetic exception and catch it using a try-catch block.


package com.example;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.print("Enter num1 = ");
			int num1 = sc.nextInt();
			System.out.print("Enter num2 = ");
			int num2 = sc.nextInt();
			int result = num1/num2;
			if (num2==0)
				throw new ArithmeticException("/ by 0");
			System.out.println("Result = "+result);
			
		} catch ( ArithmeticException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}catch ( RuntimeException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}catch ( Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		finally{
			System.out.println("In Finally Block");
			sc.close();
		}

	}

}
