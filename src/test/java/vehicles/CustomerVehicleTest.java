package vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerVehicleTest {

    CustomerVehicle customerVehicle1;
    CustomerVehicle customerVehicle2;

    @Before
    public void before(){
        customerVehicle1 = new CustomerVehicle("VW", "2.0 petrol", 4, 5000, "blue", VehicleType.CAR);
        customerVehicle2 = new CustomerVehicle("Tesla", "4000 kw", 4, 10000, "blue", VehicleType.ELECTRIC_CAR);
    }

    @Test
    public void hasName() {
        assertEquals("VW", customerVehicle1.getName());
    }
    @Test
    public void hasEngine() {
        assertEquals("4000 kw", customerVehicle2.getEngine());
    }

    @Test
    public void hasTyres() {
        assertEquals(4,customerVehicle2.getTyres());
    }

    @Test
    public void hasPrice() {
        assertEquals(5000, customerVehicle1.getPrice(customerVehicle1));
    }

    @Test
    public void hasVehicleType() {
        assertEquals(VehicleType.CAR, customerVehicle1.getVehicleType());
    }

    @Test
    public void hasColour() {
        assertEquals("blue", customerVehicle1.getColour());
    }


}