public class Main {
    public static void main(String[] args) {
        RentalService service = new RentalService();

        // Add vehicles
        service.addVehicle(new Car("C101", "Honda City", 1200));
        service.addVehicle(new Bike("B201", "Royal Enfield", 500));
        service.addVehicle(new Truck("T301", "Tata LPT", 2000));

        service.listAvailableVehicles();

        // Rent a car
        Vehicle rentedCar = service.rentVehicle("C101");
        if (rentedCar != null) {
            System.out.println("Total cost for 3 days: ₹" + rentedCar.calculateRentalCost(3));
        }

        service.listAvailableVehicles();

        // Return car
        service.returnVehicle("C101");

        service.listAvailableVehicles();
    }
}
