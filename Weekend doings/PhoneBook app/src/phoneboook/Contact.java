package phoneboook;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String phoneNumber,  String email) {
        validateName(firstName);
        validateName(lastName);
        validatePhoneNumber(phoneNumber);
        validateEmail(email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setFirstName(String firstName) {
        validateName(firstName);
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        validateName(lastName);
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setEmail(String email) {
        validateEmail(email);
        this.email = email;
    }
    public String getEmail() { return  email.toLowerCase(); }


    public void validateName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }

    public void validatePhoneNumber(String phoneNumber) {
       if (phoneNumber.length() != 11 || phoneNumber.isBlank()) throw new IllegalArgumentException("Phone number must be 11 digits");
    }

    public void validateEmail(String email) {
        if (email.isBlank() || email.length() > 50) throw new IllegalArgumentException("Email or empty");
        if(!(email.contains("@") && email.contains(".com"))) throw new IllegalArgumentException("Email address not properly written");
    }
}
