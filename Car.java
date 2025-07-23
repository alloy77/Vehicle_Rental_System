public class Car extends Vehicle {
    public Car(String vehicleID, String modelName, double rentalRate) {
        super(vehicleID, modelName, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days + 500; // Extra fixed cleaning fee
    }
}
