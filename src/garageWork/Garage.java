package garageWork;
import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles;
	
	public Garage() {
		vehicles = new ArrayList<Vehicle>();
		
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
		System.out.println(vehicle.getId()+ " Added to Garage");
	}
	
	public void removeVehicle(Vehicle vehicle) {
		if(vehicles.contains(vehicle)) {
			System.out.println(vehicle.getId()+ " removed from Garage");
			vehicles.remove(vehicle);
		} else {
			System.err.println("Vehicle not availible to be removed");
		}
	}
	
	public void removeVehicle(String id) {	
		boolean removed = false;
		for(int i = 0; i < vehicles.size(); i++) {
			if(vehicles.get(i).getId()==id) {
				removed = true;
				System.out.println("Vehicle with ID " + id + " removed from Garage");
				vehicles.remove(i);
			}
		} 
		if(!removed) {
			System.out.println("Vehicle " + id + " does not exist in the Garage");
		}
	}
	
	public void emptyGarage() {
		while(vehicles.size()!=0) {
				vehicles.remove(0);
		}
		System.out.println("Garage Emptyed");
		System.out.println(vehicles);
	}
	
	public ArrayList<Vehicle> getVehicles() {
		return this.vehicles;
	}
	
	public void showVehicles() {
		System.out.print("Vehicles:");
		for(Vehicle vehicle : vehicles) {
			System.out.print(" " + vehicle.getId());
		}
		System.out.println(" are in the Garage");
	}
	
	public void billVehicle() {
		for(Vehicle vehicle : vehicles) {
			int price = (int)(vehicle.getPrice() * (1 - vehicle.getHealth()));
			if(vehicle.getType() == "Car") {
				price += vehicle.getWheels()*1000;
				if(((Car)vehicle).getHitch()) {
					price += 500;
				}
			} else if (vehicle.getType() == "Bus") {
				price += vehicle.getPassengers() * 500;
				price += ((Bus)vehicle).getWeight();
			} else if (vehicle.getType() == "Motorcycle") {		
				if(!((Motorcycle)vehicle).getBalance()) {
					price += ((Motorcycle)vehicle).getPrice() / 4;
				}
			} else {
				System.err.println("Vehicle error");
				break;
			}		
			System.out.println("Vehicle: "+ vehicle.getId() + ", It will cost £" + price + " to repair");
		}
	}
	
	//public 
}
