package com.example;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		String userName ;
		double unit, totalBill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Electricity Bill Calculation");
		System.out.print("Enter Consumer Name : ");
		userName = sc.nextLine();
		System.out.print("Enter Consumed Unit : ");
		unit = sc.nextDouble();
		ElectricityBill b = new ElectricityBill(userName, unit);
		totalBill = b.calculateBillAmount();
		System.out.print("Consumer Name : "+userName+"\nConsumed Units = "+unit+"\nTotal Electricity Bill = "+totalBill);
	}

}
