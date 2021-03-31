package Customers;

import Dealerships.Dealership;
import vehicles.CustomerVehicle;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<CustomerVehicle> vehiclesList;

    private Vehicle vehicle;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.vehiclesList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public int getVehiclesList() {
        return vehiclesList.size();
    }

    public void addToCustomerVehicleList(CustomerVehicle customerVehicle){
        this.vehiclesList.add(customerVehicle);
    }

    public void buyVehicle(Vehicle vehicle){
        int price = this.vehicle.getPrice(vehicle);
        this.wallet -= price;
    }
}
