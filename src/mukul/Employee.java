package mukul;

public class Employee {
    private int employeweId;
    private String employeeName;
    private double employeeSalary;
    private String employeerDesignation;

    public Employee(int employeweId, String employeeName, double employeeSalary, String employeerDesignation) {
        this.employeweId = employeweId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeerDesignation = employeerDesignation;
    }
    public Employee () {

    }

    public int getEmployeweId() {
        return employeweId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeerDesignation() {
        return employeerDesignation;
    }

    public void setEmployeweId(int employeweId) {
        this.employeweId = employeweId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeerDesignation(String employeerDesignation) {
        this.employeerDesignation = employeerDesignation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeweId=" + employeweId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeerDesignation='" + employeerDesignation + '\'' +
                '}';
    }
}
