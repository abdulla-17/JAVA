package employee;

public class Employee {
    private String name;
    private int ID_number;
    private String department;
    private double salary;

    // Setters
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

    // Getters
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

    // Main method for testing
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("John Doe");
        emp1.setId(101);
        emp1.setDepartment("Engineering");
        emp1.setSalary(75000);

        Employee emp2 = new Employee();
        emp2.setName("Jane Smith");
        emp2.setId(102);
        emp2.setDepartment("Marketing");
        emp2.setSalary(68000);

        System.out.println("Name: " + emp1.getName() + ", ID: " + emp1.getId() +
                ", Department: " + emp1.getDepartment() + ", Salary: " + emp1.getSalary());

        System.out.println("Name: " + emp2.getName() + ", ID: " + emp2.getId() +
                ", Department: " + emp2.getDepartment() + ", Salary: " + emp2.getSalary());
    }
}