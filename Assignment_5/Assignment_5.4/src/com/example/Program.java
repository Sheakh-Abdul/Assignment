package com.example;

import java.util.Scanner;

public class Program {
	String customerName, phoneNo;
	int numberCall, bill,duration;
	
	void getValue() {
		
	}
	int calcuateBill(){
		
		if (numberCall <= 100) {
			 bill = numberCall * 50 * duration ;
			 
		}
		else {
			bill =( (100 * 50 ) + (numberCall-100) * 25 ) * duration;
		}
		return bill - 10 ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program p = new Program();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name = ");
		p.customerName = sc.nextLine();
		System.out.print("Enter Customer Number = ");
		p.phoneNo = sc.nextLine();
		System.out.print("Enter Number of Call = ");
		p.numberCall = sc.nextInt();
		System.out.print("Enter Call Duration (In Minutes) = ");
		p.duration = sc.nextInt();
		System.out.println("Your Total Bill = "+ (p.calcuateBill()+10));
		System.out.println("Discount $10");
		System.out.print("Your Payble Bill = ");
		System.out.println(p.calcuateBill());
		

	}

}
