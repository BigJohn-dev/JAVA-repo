import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestComputeNumbers {

	@Test
	void Test positiveCountIn() {
	int actual = (1, 2, 3, -1, -2);
	String expected = "The number of positives is 3";
	assertEquals(actual, expected);
}



}