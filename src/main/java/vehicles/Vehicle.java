package vehicles;

import Behaviours.IStock;

public abstract class Vehicle implements IStock {

    protected String name;
    private String engine;
    private int tyres;

    protected int price;
    private String colour;

    public Vehicle(String name, String engine, int tyres, int price, String colour) {
        this.name = name;
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public int getTyres() {
        return tyres;
    }

    public int getPrice(Vehicle vehicle) {
        return vehicle.price;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

}
