/*
 * This class creates a timecard for each employee
 */
package payrollsystem;

/**
 *
 * @author metan
 */
public class Timecard {

    String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public float getHoursworked() {
        return hoursworked;
    }

    public void setHoursworked(float hoursworked) {
        this.hoursworked = hoursworked;
    }

    public float getOvertimehours() {
        return overtimehours;
    }

    public void setOvertimehours(float overtimehours) {
        this.overtimehours = overtimehours;
    }
    int empID;
    float hoursworked;
    float overtimehours;
}
