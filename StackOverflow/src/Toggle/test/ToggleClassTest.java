package Toggle.test;

import Toggle.ToggleClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ToggleClassTest {

    @Test
    public void ToggleClassTest() {
        ToggleClass toggleClass = new ToggleClass();
        assertTrue(toggleClass.toggle());
        assertFalse(toggleClass.toggle());
    }
}
