
/*
 * 8/30/20 Tanner Stout Lab 1
 */
package payrollsystem;

import java.util.Date;

/**
 *
 * @author metan
 */

public class PayrollSystem {

    public static void main(String[] args) {
        SalaryEmployee s1 = new SalaryEmployee();
        SalaryEmployee s2 = new SalaryEmployee();
        s1.setAnnualSal(20000);
        s1.setEmpID(1);
        s1.setFirstName("John");
        s1.setLastName("Woods");
        s1.setSSN(12345678);
        s2.setAnnualSal(80000);
        s2.setEmpID(2);
        s2.setFirstName("Mike");
        s2.setLastName("Kites");
        s2.setSSN(78178165);
        HourlyEmployee e1 = new HourlyEmployee();
        HourlyEmployee e2 = new HourlyEmployee();
        e1.setEmpID(3);
        e1.setHourlyrate(25);
        e1.setOvertimerate(10);
        e2.setEmpID(4);
        e2.setHourlyrate(20);
        e2.setOvertimerate(12);
        Timecard c1 = new Timecard();
        Timecard c2 = new Timecard();
        c1.setDate(new Date().toString());
        c1.setEmpID(3);
        c1.setHoursworked(30);
        c1.setOvertimehours(7);
        c2.setDate(new Date().toString());
        c2.setEmpID(4);
        c2.setHoursworked(45);
        c2.setOvertimehours(0);
        WithHold w1 = new WithHold();
        WithHold w2 = new WithHold();
        w1.setAmount(100);
        w1.setDescription("Timecard not filled");
        w1.setID(3);
        w1.setRate(5);
        w2.setAmount(10);
        w2.setDescription("Project not approved");
        w2.setID(4);
        w2.setRate(2);
    }

    public float calculatePayroll() {
        return 0F;
    }

}
