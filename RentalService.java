import java.util.*;

public class RentalService {
    private Map<String, Vehicle> vehicles = new HashMap<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getVehicleID(), vehicle);
    }

    public Vehicle rentVehicle(String vehicleID) {
        Vehicle vehicle = vehicles.get(vehicleID);
        if (vehicle != null && vehicle.rentVehicle()) {
            System.out.println(vehicle + " has been rented.");
            return vehicle;
        } else {
            System.out.println("Vehicle not available for rent.");
            return null;
        }
    }

    public void returnVehicle(String vehicleID) {
        Vehicle vehicle = vehicles.get(vehicleID);
        if (vehicle != null && vehicle.isRented()) {
            vehicle.returnVehicle();
            System.out.println(vehicle + " has been returned.");
        } else {
            System.out.println("Invalid return. Either vehicle doesn't exist or isn't rented.");
        }
    }

    public void listAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle v : vehicles.values()) {
            if (!v.isRented()) {
                System.out.println(" - " + v);
            }
        }
    }
}
