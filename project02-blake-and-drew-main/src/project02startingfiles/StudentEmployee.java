package project02startingfiles;

/**
 *
 * @author S539749
 */
public class StudentEmployee extends Employee {

    private int hoursWorked;
    private boolean isWorkStudy;
    private double payRate;

    //Constructor
    public StudentEmployee(String name, int number, boolean working, int hours, boolean workStudy, double rate) {
        super(name, number, working);
        this.hoursWorked = hours;
        this.isWorkStudy = workStudy;
        this.payRate = rate;
    }

    //other methods
    public String toString() {
        return super.toString() + "\t" + hoursWorked + "\t " + isWorkStudy + "\t " + payRate;
    }

    public double getPay() {
        return hoursWorked * payRate;
    }

}
