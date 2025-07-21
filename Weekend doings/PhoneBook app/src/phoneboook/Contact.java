package phoneboook;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        validate(firstName);
        validate(lastName);
        validate(phoneNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public void setFirstName(String firstName) {
        validate(firstName);
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        validate(lastName);
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private void validate(String name, String phoneNumber) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }

    private void validate(String phoneNumber) {
        if (phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be empty");
        } else if (phoneNumber.length() != 11) {
            throw new IllegalArgumentException("Phone number must be 11 digits");
        }
    }
}
