package garageWork;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car(4, "Car1", 0.90, 12000, 5, true);
		Car car2 = new Car(5, "Car2", 0.85, 16000, 5, false);
		Bus bus1 = new Bus(6, "Bus1", 0.75, 40000, 22, 5000);
		Bus bus2 = new Bus(8, "Bus2", 0.40, 80000, 40, 9000);
		Motorcycle moto = new Motorcycle(2, "Motorcycle1", 0.90, 1200, 2, true);
		Garage garage = new Garage();
		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(bus1);
		garage.addVehicle(bus2);
		garage.addVehicle(moto);
		//garage.removeVehicle(bus1);
		//garage.removeVehicle("Car2");
		garage.billVehicle();
		garage.showVehicles();
		garage.emptyGarage();
		
	}

}
