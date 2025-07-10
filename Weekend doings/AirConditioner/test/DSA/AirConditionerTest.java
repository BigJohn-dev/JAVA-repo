package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner currentState;

    @BeforeEach
    public void setup() {
        currentState = new AirConditioner();
    }

    @Test
    public void testAirConditionerToTurnOn() {
        currentState.turnOff();
        assertFalse(currentState.isOn());
        currentState.turnOn();
        assertTrue(currentState.isOn());
    }

    @Test
    public void testAirConditionerToTurnOff() {
        currentState.turnOff();
        assertFalse(currentState.isOn());
        currentState.turnOn();
        assertTrue(currentState.isOn());
        currentState.turnOff();
        assertFalse(currentState.isOn());
    }

    @Test
    public void testAirConditionerTemperatureIncrease() {
        currentState.turnOff();
        assertFalse(currentState.isOn());
        currentState.turnOn();
        assertTrue(currentState.isOn());
        currentState.increaseTemperature(20);
        assertEquals(30, currentState.getTemperature());
    }

    @Test
    public void testAirConditionerTemperatureDecrease() {
        currentState.turnOff();
        assertFalse(currentState.isOn());
        currentState.turnOn();
        assertTrue(currentState.isOn());
        currentState.increaseTemperature(4);
        currentState.decreaseTemperature(10);
        assertEquals(16, currentState.getTemperature());
    }

    @Test
    public void testAirConditionerTemperatureDoesNotIncreaseBeyond_30Degrees() {
        currentState.turnOff();
        assertFalse(currentState.isOn());
        currentState.turnOn();
        assertTrue(currentState.isOn());
        currentState.increaseTemperature(36);
        assertEquals(30, currentState.getTemperature());
    }

    @Test
    public void testAirConditionerTemperatureDoesNotDecreaseBelow_16Degrees() {
        currentState.turnOff();
        assertFalse(currentState.isOn());
        currentState.turnOn();
        assertTrue(currentState.isOn());
        currentState.decreaseTemperature(10);
        assertEquals(16, currentState.getTemperature());
    }


}