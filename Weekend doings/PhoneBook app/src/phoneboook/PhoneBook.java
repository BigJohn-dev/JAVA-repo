package phoneboook;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }
    public ArrayList<Contact> addContact(Contact contact) {
        contacts.add(contact);
        return contacts;
    }
    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
