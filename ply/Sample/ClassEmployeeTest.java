package Sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassEmployeeTest {

    @Test
    public void testThatEmployeeCreateAccount(){
        ClassEmployee employee = new ClassEmployee("John", "Doe", "123456789", 3.0, 0.4);
        assertEquals("John", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("123456789", employee.getSocialSecurityNumber());
        assertEquals(3.0, employee.getGrossSale());
        assertEquals(0.4, employee.getCommissionRate());
    }

    @Test
    public void testThatEmployeeDoesNotCreateAccountWithEmptyNames(){
        ClassEmployee employee = new ClassEmployee(" ", " ", "123456789", 3.0, 0.4);
        assertEquals(" ", employee.getFirstName());
        assertEquals(" ", employee.getLastName());
    }
}