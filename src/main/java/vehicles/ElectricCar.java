package vehicles;

public class ElectricCar extends Vehicle{

    VehicleType vehicleType;
    public ElectricCar(String name, String engine, int tyres, int price, String colour, VehicleType vehicleType) {
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
