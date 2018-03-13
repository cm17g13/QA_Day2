package garageWork;

public class Bus extends Vehicle {

	private int weight;
	
	public Bus(int wheels, String id, double health, int price, int passengers, int weight) {
		super(wheels, id, "Bus", health, price, passengers);
		this.weight = weight;
	}
	
	public void setWeight(int i) {
		this.weight = i;
	}
	public int getWeight() {
		return this.weight;
	}
}
