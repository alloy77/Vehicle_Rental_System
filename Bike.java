public class Bike extends Vehicle {
    public Bike(String vehicleID, String modelName, double rentalRate) {
        super(vehicleID, modelName, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}
