import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestPayroll {

    @Test
    void testGrossPay() {
        double expected = 1000.0;
        double actual = payroll.grossPay(25, 40);
        assertEquals(expected, actual, 0.001); 
}

    @Test
    void testFederalTax() {
        double expected = 200.0;
        double actual = payroll.federalTax(25);
        assertEquals(expected, actual, 0.001);
}

    @Test
    void testStateTax() {
        double expected = 90.0;
        double actual = payroll.stateTax(1000);
        assertEquals(expected, actual, 0.001);
}
}
