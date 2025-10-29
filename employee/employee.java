package employee;

public class employee {
    private String name;
    private int ID_number;
    private String department;
    private double salary;

    
    public employee(String name, int ID_number, String department, double salary) {
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

class EmployeeTest {
    public static void main(String[] args) {
        employee emp1 = new employee("John Doe", 101, "Engineering", 75000);
        employee emp2 = new employee("Jane Smith", 102, "Marketing", 68000);

        System.out.println("Name: " + emp1.getName() + ", ID: " + emp1.getId() + ", Department: " + emp1.getDepartment() + ", Salary: " + emp1.getSalary());
        System.out.println("Name: " + emp2.getName() + ", ID: " + emp2.getId() + ", Department: " + emp2.getDepartment() + ", Salary: " + emp2.getSalary());
    }
}