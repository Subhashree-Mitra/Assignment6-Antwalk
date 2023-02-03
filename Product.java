package assignment6;

public class Product {
	String name;
	String brand;
	int quantity;
	double price;
	
	public Product(String name,String brand,int quantity,double price) {
		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
	}
	
	
}
