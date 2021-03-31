package vehicles;

public class Car extends Vehicle {

   VehicleType vehicleType;

    public Car(String name, String engine, int tyres, int price, String colour, VehicleType vehicleType){
        super(name, engine, tyres, price, colour);
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType(){
        return  vehicleType;
    }
}
