package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeTest {

    @Test
    public void  TimeTest() {
        Time time = new Time(5,30,20);
        assertEquals(5, time.getHour());
        assertEquals(30, time.getMinute());
        assertEquals(20, time.getSecond());
    }

    @Test
    public void  cannotSetTimeOutOfBounds() {
        Time time = new Time(25,75,95);
        assertEquals(25,time.getHour());
        assertEquals(75,time.getMinute());
        assertEquals(95,time.getSecond());
    }
}
