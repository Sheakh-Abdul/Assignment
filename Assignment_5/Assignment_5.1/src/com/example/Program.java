package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Format = ");
		String str = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf2= new SimpleDateFormat("yyyy/mm/dd");
		
		SimpleDateFormat sdf3= new SimpleDateFormat(str);
		Date date = new Date();
		String format = sdf.format(date);
		String format1 = sdf1.format(date);
		String format2 = sdf2.format(date);
		String format3 = sdf3.format(date);
		System.out.println("Format");
		System.out.println("1st input (dd/mm/yyyy) = "+format);
		System.out.println("2nd input (mm/dd/yyyy) = "+format1);
		System.out.println("3rd input (yyyy/mm/dd) = "+format2);
		System.out.println("\nUser input "+str+" = "+format3);

	}

}
