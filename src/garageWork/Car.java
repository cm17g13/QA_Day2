package garageWork;

public class Car extends Vehicle {

	private boolean hitch;
	
	public Car (int wheels, String id, double health, int price, int passengers, boolean hitch) {
		super(wheels, id, "Car", health, price, passengers);
		this.hitch = hitch;
	}
	
	public void setHitch(boolean b) {
		this.hitch = b;
	}
	public boolean getHitch() {
		return this.hitch;
	}
}
