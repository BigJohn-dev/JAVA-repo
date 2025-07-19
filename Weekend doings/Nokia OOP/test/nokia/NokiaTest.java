package nokia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NokiaTest {

    @Test
    public void testThatDeviceCanBeTurnedOn(){
        Nokia nokia = new Nokia();
        nokia.turnOn();
        assertTrue(nokia.powerDevice());
    }

    @Test
    public void testThatDeviceCanBeTurnedOff(){
        Nokia nokia = new Nokia();
        nokia.turnOff();
        assertFalse(nokia.powerDevice());
    }
}
