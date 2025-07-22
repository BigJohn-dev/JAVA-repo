package phonebooktest;

import org.junit.jupiter.api.Test;
import phoneboook.Contact;
import phoneboook.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact("John", "Doe", "123-456-78900", " "));
        //assertEquals(phoneBook.getContacts());
    }
}
