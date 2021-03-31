package Customers;

import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.CustomerVehicle;
import vehicles.VehicleType;

import static org.junit.Assert.*;


public class CustomerTest {

    Customer customer;
    CustomerVehicle customerVehicle1;
    CustomerVehicle customerVehicle2;

    Car car;




    @Before
    public void before(){

        car = new Car("ford", "1.2", 4, 2000, "red", VehicleType.CAR);

        customerVehicle1 = new CustomerVehicle("VW", "2.0 petrol", 4, 5000, "blue", VehicleType.CAR);
        customerVehicle2 = new CustomerVehicle("Tesla", "4000 kw", 4, 10000, "blue", VehicleType.ELECTRIC_CAR);
        customer = new Customer("Sally", 20000);


    }

    @Test
    public void getName() {
        assertEquals("Sally", customer.getName());
    }

    @Test
    public void getWallet() {
        assertEquals(20000, customer.getWallet());
    }

    @Test
    public void getVehicleList() {
        customer.addToCustomerVehicleList(customerVehicle1);
        customer.addToCustomerVehicleList(customerVehicle2);
        assertEquals(2, customer.getVehiclesList());
    }

    @Test
    public void canBuyVehicle() {
        customer.buyVehicle(car);
        assertEquals( 18000, customer.getWallet());
    }

}