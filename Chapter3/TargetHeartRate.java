public class TargetHeartRate {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String monthOfBirth;
    private String yearOfBirth;

    public TargetHeartRate(String firstName, String lastName, String dateOfBirth, String monthOfBirth, String yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }
    public String getMonthOfBirth() {
        return monthOfBirth;
    }
    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String yearsOld(String dateOfBirth, String monthOfBirth, String yearOfBirth) {

    }
}
