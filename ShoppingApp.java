package asn6;

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
		
		
		Customer c = new Customer();
		c.login();
		c.profile();
		
		System.out.println("\n**************PRODUCT LIST*************");
		//System.out.println("The product list is:\n");
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
		
		
		
		
		while(true) {
			System.out.println("Enter the product no. you wanna purchase: ");
			int prod = sc.nextInt();
			System.out.println("Enter the quantity: ");
			int qty = sc.nextInt();
			sc.nextLine();
			
			switch(prod) {
			case 1:
				if(checkQty(p1,qty)) {
					c.addToCart(p1,qty);
					p1.quantity -= qty;
				}
				else
					System.out.println("Not enough product");
				break;
				
			case 2:
				if(checkQty(p2,qty)) {
					c.addToCart(p2,qty);
					p2.quantity -= qty;
				}
				else
					System.out.println("Not enough product");
				break;
				
			case 3:
				if(checkQty(p3,qty)) {
					c.addToCart(p3,qty);
					p3.quantity -= qty;
				}
				else
					System.out.println("Not enough product");
				break;
				
			case 4:
				if(checkQty(p4,qty)) {
					c.addToCart(p4,qty);
					p4.quantity -= qty;
				}
				else
					System.out.println("Not enough product");
				break;
				
			case 5:
				if(checkQty(p5,qty)) {
					c.addToCart(p5,qty);
					p5.quantity -= qty;
				}
				else
					System.out.println("Not enough product");
				break;
			}
			
			System.out.println("Do you want to continue shopping?");
			System.out.println("Type yes/no");
			String ch = sc.nextLine().toLowerCase();
			
			if(ch.equals("yes"))
				continue;
			else
				break;
		}
		
		System.out.println("\nYour cart details:\n");
		
		c.cartDetails();
		
		System.out.println("The product quantity after the shopping is:\n");
		System.out.println("Product 1:");
		System.out.println(p1.quantity);
		
		System.out.println("Product 2:");
		System.out.println(p2.quantity);
		
		System.out.println("Product 3:");
		System.out.println(p3.quantity);
		
		System.out.println("Product 4:");
		System.out.println(p4.quantity);
		
		System.out.println("Product 5:");
		System.out.println(p5.quantity);
		
		
		

	}
	
	public static boolean checkQty(Product p, int n) {
		if(n>p.quantity)
			return false;
		return true;
	}

}
