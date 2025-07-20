package phonebooktest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ContactTest {

    @Test
    public void testThatAccountIsCreated() {
        Contact contact = new Contact("John", "Doe", "1234567890");
        assertNotNull(contact);
    }

    @Test
    public void testGettersReturnCorrectValues() {
        Contact contact = new Contact("Jane", "Smith", "0987654321");
        assertEquals("Jane", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("0987654321", contact.getPhoneNumber());
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
