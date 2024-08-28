import java.util.*;
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
this.department = department;
this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
this.department = department;
    }

    public void setSalary(double salary) {
this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: Rs" + salary;
    }
}


  class EmployeeManagementSystem {
    private Map<Integer, Employee> employees;

    public EmployeeManagementSystem() {
        employees = new HashMap<>();
    }

    public void addEmployee(int id, String name, String department, double salary) {
        if (employees.containsKey(id)) {
System.out.println("Employee with this ID already exists.");
            return;
        }
        Employee employee = new Employee(id, name, department, salary);
employees.put(id, employee);
System.out.println("Employee added successfully.");
    }

    public void updateEmployee(int id, String name, String department, double salary) {
        Employee employee = employees.get(id);
        if (employee == null) {
System.out.println("Employee not found.");
            return;
        }
employee.setName(name);
employee.setDepartment(department);
employee.setSalary(salary);
System.out.println("Employee details updated successfully.");
    }

    public void deleteEmployee(int id) {
        if (employees.remove(id) != null) {
System.out.println("Employee deleted successfully.");
        } else {
System.out.println("Employee not found.");
        }
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
System.out.println("No employees to display.");
            return;
        }
        for (Employee employee :employees.values()) {
System.out.println(employee);
        }
    }

    public void searchEmployee(int id) {
        Employee employee = employees.get(id);
        if (employee != null) {
System.out.println(employee);
        } else {
System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
EmployeeManagementSystem ems = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
System.out.println("Select an option:");
System.out.println("1. Add employee");
System.out.println("2. Update employee details");
System.out.println("3. Delete employee");
System.out.println("4. Display all employees");
System.out.println("5. Search for an employee");
System.out.println("6. Exit");
            int choice = scanner.nextInt();
scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
System.out.println("Enter employee ID:");
                    int id = scanner.nextInt();
scanner.nextLine();  // Consume newline
System.out.println("Enter employee name:");
                    String name = scanner.nextLine();
System.out.println("Enter employee department:");
                    String department = scanner.nextLine();
System.out.println("Enter employee salary:");
                    double salary = scanner.nextDouble();
ems.addEmployee(id, name, department, salary);
                    break;
                case 2:
System.out.println("Enter employee ID:");
                    int updateId = scanner.nextInt();
scanner.nextLine();  // Consume newline
System.out.println("Enter new name:");
                    String newName = scanner.nextLine();
System.out.println("Enter new department:");
                    String newDepartment = scanner.nextLine();
System.out.println("Enter new salary:");
                    double newSalary = scanner.nextDouble();
ems.updateEmployee(updateId, newName, newDepartment, newSalary);
                    break;
                case 3:
System.out.println("Enter employee ID to delete:");
                    int deleteId = scanner.nextInt();
ems.deleteEmployee(deleteId);
                    break;
                case 4:
ems.displayAllEmployees();
                    break;
                case 5:
System.out.println("Enter employee ID to search:");
                    int searchId = scanner.nextInt();
ems.searchEmployee(searchId);
                    break;
                case 6:
System.out.println("Exiting...");
scanner.close();
                    return;
                default:
System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
