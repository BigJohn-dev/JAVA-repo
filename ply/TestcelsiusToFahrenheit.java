import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestcelsiusToFahrenheit {

	@Test
	void testfahrenheit() {
	double actual = (43.0);
	double expected = 109.4;
	//String result = 43.0 + " Celsius is " + 109.4 + " Fahrenheit";
	assertEquals(actual, expected);
}


}