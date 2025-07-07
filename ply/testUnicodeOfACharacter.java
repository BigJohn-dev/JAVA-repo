import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testUnicodeOfACharacter {

	@Test
	void testcharacter() {
	int actual = unicodeOfACharacter.character('A');
	int expected = 65;
	assertEquals(actual, expected);
}

	@Test
	void testASCII() {
	char actual = unicodeOfACharacter.unicode(65);
	char expected = 'A';
	assertEquals(actual, expected);
}


}