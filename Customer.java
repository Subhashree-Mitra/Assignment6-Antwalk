package asn6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Customer {
	
	private String name;
	private String email;
	private String phone;
	
	private Scanner sc = new Scanner(System.in);
	
	private class Cart{
		String id;
		HashMap<String,Integer> prodList = new HashMap<>();
		double total = 0;
		
		Cart(String id){
			this.id = id;
		}
		
		void printCart() {
			System.out.println("************MY CART***********");
			System.out.println("ID: " + id + "\n");
			System.out.println("Products\t\tQTY");
			System.out.println();
			for(Map.Entry<String, Integer> entry: prodList.entrySet()) {
				System.out.println(entry.getKey() + "\t\t" + entry.getValue());
			}
			
			System.out.println("------------------------------");
			System.out.println("TOTAL\t\t\t" + total);
			System.out.println("------------------------------\n");
			System.out.println("Order placed successfully");
			System.out.println("********THANK YOU********\n");
			
		}
		
		
		
	}
	
	private Cart crt;
	
	
	
	public Customer() {
		crt = new Cart("CRT1209");
	}

	public void addToCart(Product p, int n) {
		crt.prodList.put(p.name,n);
		crt.total += (n*p.price);
		
	}
	
	public void cartDetails() {
		crt.printCart();
	}
	
	public void login() {
		System.out.println("************LOGIN PAGE*************");
		System.out.println("Enter personal details:");
		System.out.println("Name: ");
		setName(sc.nextLine());
		System.out.println("Email: ");
		setEmail(sc.nextLine());
		System.out.println("Phone: ");
		setPhone(sc.nextLine());
	}
	
	public void profile() {
		System.out.println("\n************YOUR PROFILE**********");
		System.out.print("Name: " + getName() + "\n");
		System.out.print("Email: " + getEmail() + "\n");
		System.out.print("Phone: " + getPhone() + "\n");
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
