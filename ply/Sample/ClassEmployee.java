package Sample;

public class ClassEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSale;
    private double commissionRate;

    public ClassEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate) {
        if (firstName == null || firstName.equals("")) throw new IllegalArgumentException("First Name cannot be empty");
        this.firstName = firstName;

        if (lastName == null || lastName.equals("")) throw new IllegalArgumentException("Last Name cannot be empty");
        this.lastName = lastName;

        if (grossSale < 0) throw new IllegalArgumentException("Gross sale should not be less than 0");
        this.grossSale = grossSale;

        if (commissionRate < 0 ||  commissionRate > 1) throw new IllegalArgumentException("Commission rate should be between 0 and 1");
        
        this.socialSecurityNumber = socialSecurityNumber;

        this.commissionRate = commissionRate;
    }

    public String getFirstName() { return firstName;}
    public  String getLastName() { return lastName;}
    public String getSocialSecurityNumber() { return socialSecurityNumber;}
    public double getGrossSale(){ return grossSale;}
    public void setCommissionRate(double commissionRate){
        if (commissionRate < 0.0 || commissionRate > 1.0) throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0");
        this.commissionRate = commissionRate;}
    public double getCommissionRate(){ return commissionRate;}

    public double earnings(){
        return grossSale * commissionRate;
    }
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSale(),
                "commission rate", getCommissionRate());
    }
}
