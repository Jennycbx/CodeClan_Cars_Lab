package Dealerships;

import Behaviours.IStock;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.CustomerVehicle;
import vehicles.ElectricCar;
import vehicles.VehicleType;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealershipTest {


    Dealership dealership;

    Car car;

    ElectricCar electricCar;

    @Before
    public void setUp(){
        dealership = new Dealership("CodeClan sale", 50000);
        car = new Car("ford", "1.2 petrol", 4, 2000, "blue", VehicleType.CAR);
        electricCar = new ElectricCar("Tesla", "4000 kw", 4, 2000, "blue", VehicleType.ELECTRIC_CAR);
    }


    @Test
    public void hasName(){
        assertEquals("CodeClan sale", dealership.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(50000, dealership.getTill());
    }

    @Test
    public void hasStock(){
        dealership.addElectricCarToElectricCarList(electricCar);
        dealership.addCarToCarList(car);
        assertEquals(2, dealership.getAllStock());
    }

}