package employee;
public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeDetail emp1 = new EmployeeDetail("John Doe", 101, "Engineering", 75000);
        EmployeeDetail emp2 = new EmployeeDetail("Jane Smith", 102, "Marketing", 68000);

        System.out.println("Name: " + emp1.getName() + ", ID: " + emp1.getId() + ", Department: " + emp1.getDepartment() + ", Salary: " + emp1.getSalary());
        System.out.println("Name: " + emp2.getName() + ", ID: " + emp2.getId() + ", Department: " + emp2.getDepartment() + ", Salary: " + emp2.getSalary());
    }
}