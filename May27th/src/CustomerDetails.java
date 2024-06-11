import java.util.Scanner;
public class CustomerDetails {
	int id;
	String name;;
	double amount;
	public CustomerDetails(int id,String name,double amount) {
		this.id=id;
		this.name=name;
		this.amount=amount;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void Display() {
		System.out.println("Customer Id: "+id);
		System.out.println("Customer Name: "+name);
		System.out.println("Customer Order Amount: "+amount);
	}
}