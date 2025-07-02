package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    private AutomaticBike automaticBike;

    @BeforeEach
    public void setup() {
        automaticBike = new AutomaticBike();
    }

    @Test
    public void testAutomaticBikeToTurnOn(){
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
    }

    @Test
    public void testAutomaticBikeToTurnOff(){
        automaticBike.turnOff();
        assertFalse(automaticBike.isOn());
    }

    @Test
    public void testAutomaticBikeAccelerate(){
        automaticBike.turnOn();
        automaticBike.accelerateAutomaticBike(15, 1);
        assertEquals(16, automaticBike.getAcceleration());
    }
}
