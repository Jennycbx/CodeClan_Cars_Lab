package vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar("Tesla", "4000 kw", 4, 2000, "blue", VehicleType.ELECTRIC_CAR);
    }

    @Test
    public void hasName() {
        assertEquals("Tesla", electricCar.getName());
    }
    @Test
    public void hasEngine() {
        assertEquals("4000 kw", electricCar.getEngine());
    }

    @Test
    public void hasTyres() {
        assertEquals(4, electricCar.getTyres());
    }

    @Test
    public void hasPrice() {
        assertEquals(2000,electricCar.getPrice(electricCar));
    }

    @Test
    public void hasVehicleType() {
        assertEquals(VehicleType.ELECTRIC_CAR, electricCar.getVehicleType());
    }

    @Test
    public void hasColour() {
        assertEquals("blue", electricCar.getColour());
    }


}