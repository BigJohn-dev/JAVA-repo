package phonebooktest;

import org.junit.jupiter.api.Test;
import phoneboook.Contact;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testThatAccountIsCreated() {
        Contact contact = new Contact("John", "Doe", "08012345678", "bigjohn@gmail.com");
        assertNotNull(contact);
    }

    @Test
    public void testGettersReturnCorrectValues() {
        Contact contact = new Contact("Jane", "Smith", "08012345678","bigjohn@gmail.com");
        assertEquals("Jane Smith", contact.getName());
        assertEquals("08012345678", contact.getPhoneNumber());
        assertEquals("bigjohn@gmail.com", contact.getEmail());
    }

    @Test
    public void testThatEitherNameGivenIsNotEmpty() {
        Contact contact = new Contact("John", "Doe", "08012345678", "bigjohn@gmail.com");
        assertThrows(IllegalArgumentException.class, () -> new Contact(" ", " ", "08012345678", "bigjohn@gmail.com"));
    }

    @Test
    public void testThatPhoneNumberGivenIsNotEmpty() {
        Contact contact = new Contact("John", "Doe", "08012345678", "bigjohn@gmail.com");
        assertThrows(IllegalArgumentException.class, () -> new Contact("John", "Doe", " ", "bigjohn@gmail.com"));
    }

    @Test
    public void testThatPhoneNumberGivenIs11Digits() {
        Contact contact = new Contact("John", "Doe", "08011235674", "bigjohn@gmail.com");
        assertThrows(IllegalArgumentException.class, () -> new Contact("John", "Doe", "080112345674", "bigjohn@gmail.com"));
    }

    @Test
    public void testThatEmailGivenIsNotEmpty() {
        Contact contact = new Contact("John", "Doe", "08011234567", "bigjohn@gmail.com");
        assertThrows(IllegalArgumentException.class, () -> new Contact("John", "Doe", "08011234567", " "));
    }

    @Test
    public void testThatEmailGivenHaveAtSymbol() {
        Contact contact = new Contact("John", "Doe", "08011234567", "bigjohn@gmail.com");
        assertThrows(IllegalArgumentException.class, () -> new Contact("John", "Doe", "08011234567", "bigjohngmail.com"));
    }

    @Test
    public void testThatEmailGivenEndsWithTheGmailSyntax() {
        Contact contact = new Contact("John", "Doe", "08011234567", "bigjohn@gmail.com");
        assertThrows(IllegalArgumentException.class, () -> new Contact("John", "Doe", "08011234567", "bigjohn@gmail"));
    }

    @Test
    public void testThatEmailGivenAreConvertedToSmallCaseIgnoringUserInput() {
        Contact contact = new Contact("John", "Doe", "08011234567", "BigJohn@gmail.com");
        assertEquals("bigjohn@gmail.com", contact.getEmail());
    }
}
