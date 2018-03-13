package garageWork;

public class Motorcycle extends Vehicle {

	private boolean balance;
	
	public Motorcycle(int wheels, String id, double health, int price, int passengers, boolean balance) {
		super(wheels, id, "Motorcycle", health, price, passengers);
		this.balance = balance;
	}
	
	public void setBalance(boolean b) {
		this.balance = b;
	}
	
	public boolean getBalance() {
		return this.balance;
	}
	
}
