package Dealerships;

import Behaviours.IStock;
import vehicles.Car;
import vehicles.ElectricCar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dealership{

    private String name;
    private int till;
    private ArrayList<Car> carList;
    private ArrayList<ElectricCar> electricCarList;

    public Dealership(String name, int till) {
        this.name = name;
        this.till = till;
        this.carList =  new ArrayList<>();
        this.electricCarList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTill() {
        return till;
    }

    public int getCarList() {
        return this.carList.size();
    }

    public void addCarToCarList(Car car){
        this.carList.add(car);
    }

    public void addElectricCarToElectricCarList(ElectricCar electricCar){
        this.electricCarList.add(electricCar);
    }

    public int getElectricCarList() {
        return this.electricCarList.size();
    }


    public int getAllStock() {
        ArrayList<IStock> stock = new ArrayList<>();
        stock.addAll(this.carList);
        stock.addAll(this.electricCarList);
        return stock.size();
    }
}
