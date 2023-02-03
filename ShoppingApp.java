package assignment6;

import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		//creation of all the products
		Product p1 = new Product("Black T-Shirt", "Roadster", 5, 599);
		Product p2 = new Product("Grey Cargo Pant", "Mast & Harbour", 10, 1799);
		Product p3 = new Product("Cotton Kurta Set with Dupatta", "Biba", 2, 2999);
		Product p4 = new Product("Sneakers", "Puma", 20, 4000);
		Product p5 = new Product("Cargo Shorts", "H&M", 10, 1599);
		
		System.out.println("The product list is:\n");
		System.out.println("Product 1:");
		p1.display();
		System.out.println();
		System.out.println("Product 2:");
		p2.display();
		System.out.println();
		System.out.println("Product 3:");
		p3.display();
		System.out.println();
		System.out.println("Product 4:");
		p4.display();
		System.out.println();
		System.out.println("Product 5:");
		p5.display();
		System.out.println();
		
		Customer c = new Customer();
		
		
		System.out.println("Enter the product no. you wanna purchase: ");
		int prod = sc.nextInt();
		System.out.println("Enter the quantity: ");
		int qty = sc.nextInt();
		sc.nextLine();
		
		

	}

}
