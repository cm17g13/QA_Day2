package garageWork;

public abstract class Vehicle {

	private int wheels;
	private String id;
	private String type;
	private double health;
	private int price;
	private int passengers;
	
	//ID, Vehicle Type, 
	public Vehicle(int wheels, String id, String type, double health, int price, int passengers) {
		this.wheels = wheels;
		this.id = id;
		this.type = type;
		this.health = health;
		this. price = price;
		this.passengers = passengers;
	}
	
	public void setWheels(int w) {
		this.wheels = w;
	}
	public int getWheels() {
		return this.wheels;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setHealth(Double d) {
		this.health = d;
	}
	public double getHealth() {
		return this.health;
	}
	
	public void setPrice(int i) {
		this.price = i;
	}
	public int getPrice() {
		return this.price;
	}
	
	public void setPassengers(int i) {
		this.passengers = i;
	}
	public int getPassengers() {
		return this.passengers;
	}
	
}
