package phonebooktest;

import org.junit.jupiter.api.Test;
import phoneboook.Contact;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testThatAccountIsCreated() {
        Contact contact = new Contact("John", "Doe", "1234567890");
        assertNotNull(contact);
    }

    @Test
    public void testGettersReturnCorrectValues() {
        Contact contact = new Contact("Jane", "Smith", "0987654321");
        assertEquals("Jane Smith", contact.getName());
        assertEquals("0987654321", contact.getPhoneNumber());
    }

    @Test
    public void testThatEitherNameGivenIsNotEmpty() {
        Contact contact = new Contact("John", "Doe", "1234567890");
        assertThrows(IllegalArgumentException.class, () -> new Contact(" ", " ", "1234567890"));
    }

    @Test
    public void testThatEitherPhoneNumberGivenIsNotEmpty() {
        Contact contact = new Contact("John", "Doe", "1234567890");
        assertThrows(IllegalArgumentException.class, () -> new Contact("John", "Doe", " "));
    }

    @Test
    public void testThatEitherPhoneNumberGivenIsNotMoreThan11Digits() {
        Contact contact = new Contact("John", "Doe", "0801123567");
        assertEquals(11, contact.getPhoneNumber().length());
        assertThrows(IllegalArgumentException.class, () -> new Contact("John", "Doe", "08011234567"));
    }
    @Test
    public void testSetFirstName() {
        Contact contact = new Contact("John", "Doe", "1234567890");
        contact.setFirstName("Alice");
        assertEquals("Alice", contact.getFirstName());
    }

    @Test
    public void testSetLastName() {
        Contact contact = new Contact("John", "Doe", "1234567890");
        contact.setLastName("Brown");
        assertEquals("Brown", contact.getLastName());
    }

    @Test
    public void testSetPhoneNumber() {
        Contact contact = new Contact("John", "Doe", "1234567890");
        contact.setPhoneNumber("5555555555");
        assertEquals("5555555555", contact.getPhoneNumber());
    }
}
