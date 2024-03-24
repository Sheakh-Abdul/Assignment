// 3 -Write a Java program throws an array index out of bound exception.
//		throws an exception if the number is odd.

package com.example;
import java.util.Scanner;


public class Program {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Numbers of Elements  = ");
		int num = sc.nextInt();
		System.out.print("Enter Elements  = ");
		for (int i=0;i<num;i++) {
		try {
			if(i == arr.length) {
				throw new ArrayIndexOutOfBoundsException("Array Index is Out Of Limit.");
			}
			arr[i]= sc.nextInt();
			
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//break;
		}
		}
		for(int k=0 ; k<num;k++) {
			System.out.print(arr[k]+" ");
		}
		
		System.out.println("In main Block");
		sc.close();	
	}

	
}
