package payrollsystem;
//*This class is a blueprint of any employee having the basic information of any employee to be created /

/**
 *
 * @author metan
 */
public class Employee {

    int empID;

    public int getEmpID() { //getter for employee ID
        return empID;
    }

    public void setEmpID(int empID) { //setter for employee ID
        this.empID = empID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int sSN) {
        SSN = sSN;
    }
    String lastName, firstName;
    int SSN;

}
