package com.example;

public class ElectricityBill {
	
	private String customerName;
	private double unitsConsumed;
	private double billAmount;
	
	 ElectricityBill (String customer , double units ) {
		this.customerName = customer;
		this.unitsConsumed = units;
	}

	public double calculateBillAmount() {
		 if (unitsConsumed <= 100) {
		        billAmount = unitsConsumed * 5;
		    } else if (unitsConsumed > 100 && unitsConsumed <= 300) {
		        billAmount = 100 * 5 + (unitsConsumed - 100) * 7;
		    } else {
		        billAmount = 100 * 5 + 200 * 7 + (unitsConsumed - 300) * 10;
		    }
		    
		    return billAmount;
	}

	

}
