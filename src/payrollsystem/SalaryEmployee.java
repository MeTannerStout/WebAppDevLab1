/*
 * This class is to create salaried employee
 */
package payrollsystem;

/**
 *
 * @author metan
 */
public class SalaryEmployee extends Employee {

    int empID;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getAnnualSal() {
        return annualSal;
    }

    public void setAnnualSal(int annualSal) {
        this.annualSal = annualSal;
    }
    int annualSal;
}
