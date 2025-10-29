package employee;

public class EmployeeDetail {
    private String name;
    private int ID_number;
    private String department;
    private double salary;

    
    public EmployeeDetail(String name, int ID_number, String department, double salary) {
        this.name = name;
        this.ID_number = ID_number;
        this.department = department;
        this.salary = salary;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int ID_number) {
        this.ID_number = ID_number;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public String getName() {
        return name;
    }

    public int getId() {
        return ID_number;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}