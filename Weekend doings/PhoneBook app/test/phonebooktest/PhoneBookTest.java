package phonebooktest;

import org.junit.jupiter.api.Test;
import phoneboook.Contact;
import phoneboook.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testPhoneBookToAddContact() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact("John", "Doe", "12345678900", "bigjohn@gmai.com"));
        assertEquals(1, phoneBook.getContacts());
    }

    @Test
    public void testPhoneBookToStoreMultipleContacts() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact("John", "Doe", "12345678900", "bigjohn@gmai.com"));
        phoneBook.addContact(new Contact("Big", "Baller", "00987654321", "bigballer@gmai.com"));
        phoneBook.addContact(new Contact("Chichi", "chinwe", "12131415161", "chichi@gmai.com"));
        assertEquals(3, phoneBook.());
    }
}
