package Sample;

public class BasePlusClassEmployee extends ClassEmployee {
    private double baseSalary;

    public BasePlusClassEmployee(String firstName, String lastName, String socialSecurityNumber, double grossPay, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossPay, commissionRate);
        if (baseSalary < 0) throw new IllegalArgumentException("Base Salary cannot be negative");
        this.baseSalary = baseSalary;
    }
    public void setBaseSalary(double salary){
            if(salary < 0) throw new IllegalArgumentException("Base Salary cannot be negative");
            this.baseSalary = salary;
    }
    public double getBaseSalary() {return baseSalary;}

    @Override
    public double earnings(){return baseSalary + super.earnings();}

    @Override
    public String toString(){
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }
}