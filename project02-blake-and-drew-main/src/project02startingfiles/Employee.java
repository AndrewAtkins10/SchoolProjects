package project02startingfiles;

/**
 *
 * @author S539749
 */
public abstract class Employee {

    private String employeeName;
    private int employeeId;
    private boolean isWorking;

    //Constructor
    Employee(String name, int number, boolean employed) {
        this.employeeName = name;
        this.employeeId = number;
        this.isWorking = employed;
    }

    /**
     * @return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the isWorking
     */
    public boolean isIsWorking() {
        return isWorking;
    }

    /**
     * @param isWorking the isWorking to set
     */
    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    //other methods
    public String toString() {
        return employeeName + "\t" + employeeId + "\t" + isWorking;
    }

    public abstract double getPay();

}
