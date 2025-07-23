package phoneboook;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts;
    private int contactCount;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
        this.contactCount = 0;
    }

    public void addContact(Contact contact) {
       contacts.add(contact);
       contactCount++;
    }
}