/*
 * This class is used to create employees who are paid on hourly basis
 */
package payrollsystem;

/**
 *
 * @author metan
 */
public class HourlyEmployee {

    int empID;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public float getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(float hourlyrate) {
        this.hourlyrate = hourlyrate;
    }

    public float getOvertimerate() {
        return overtimerate;
    }

    public void setOvertimerate(float overtimerate) {
        this.overtimerate = overtimerate;
    }
    float hourlyrate;
    float overtimerate;
}
