public abstract class Vehicle implements Rentable {
    protected String vehicleID;
    protected String modelName;
    protected double rentalRate;
    protected boolean isRented;

    public Vehicle(String vehicleID, String modelName, double rentalRate) {
        this.vehicleID = vehicleID;
        this.modelName = modelName;
        this.rentalRate = rentalRate;
        this.isRented = false;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public boolean isRented() {
        return isRented;
    }

    public abstract double calculateRentalCost(int days);

    @Override
    public boolean rentVehicle() {
        if (!isRented) {
            isRented = true;
            return true;
        }
        return false;
    }

    @Override
    public void returnVehicle() {
        isRented = false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " - " + modelName + " (ID: " + vehicleID + ")";
    }
}
