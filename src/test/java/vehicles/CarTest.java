package vehicles;

import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car("ford", "1.2 petrol", 4, 2000, "blue", VehicleType.CAR);
    }

    @Test
    public void hasName() {
        assertEquals("ford", car.getName());
    }
    @Test
    public void hasEngine() {
        assertEquals("1.2 petrol", car.getEngine());
    }

    @Test
    public void hasTyres() {
        assertEquals(4, car.getTyres());
    }

    @Test
    public void hasPrice() {
        assertEquals(2000, car.getPrice(car));
    }

    @Test
    public void hasVehicleType() {
        assertEquals(VehicleType.CAR, car.getVehicleType());
    }

    @Test
    public void hasColour() {
        assertEquals("blue", car.getColour());
    }

}