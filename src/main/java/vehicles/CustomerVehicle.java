package vehicles;

public class CustomerVehicle extends Vehicle {

    private VehicleType vehicleType;

    public CustomerVehicle(String name, String engine, int tyres, int price, String colour, VehicleType vehicleType) {
        super(name, engine, tyres, price, colour);
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getPrice(Vehicle vehicle) {
        return vehicle.price;
    }
}
