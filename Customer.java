package assignment6;

import java.util.HashMap;

public class Customer {
	
	private String name;
	private String email;
	private String phone;
	
	private class Cart{
		String id;
		HashMap<String,Integer> prodList = new HashMap<>();
		double total;
		
		
		
		
	}
	
	Cart c = new Cart();

	
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
	
	
	public void addToCart(Product p) {
		c.prodList.put(p.name,p.quantity);
		
	}
	
	
	
	

}
