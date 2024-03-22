package com.example;

public class Book {
	private String title, auther, publisher, isbn;
	private int year , quantity;
	private double price;
	{
		this.title = "Art of Programming";
		this.auther = "Adeem Abbas";
		this.price = 1000.00;
		this.quantity = 3;
		this.publisher = "DELHI BOOK STORE";
		this.isbn = "9780131577952";
		this.year = 2003;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void increaseQuantity(int quantity){
		this.quantity += quantity;
		
	}
	
	public void decreaseQuantity(int quantity){
		this.quantity -= quantity;
	}
	public void getInventoryValue() {
		System.out.println("The total value of the inventory for the book " + this.title + " is: Rs. " + (this.price * this.quantity));
	}

}
