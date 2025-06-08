import model.Employee;
import service.EmployeeService;
import util.InputUtil;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        while (true) {
            System.out.println("\n=== PERSONNEL MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Employee");
            System.out.println("2. List Employees");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("0. Exit");

            int choice = InputUtil.getInt("Choose an option");

            switch (choice){
                case 1:
                    Employee employee = InputUtil.createEmployeeFromInput();
                    employeeService.addEmployee(employee);
                    break;

                case 2:
                    employeeService.listEmployees();
                    break;

                case 3:
                      int updateId = InputUtil.getInt("Enter Employee ID to update");
                      double newSalary= InputUtil.getDouble("Enter new Salary");
                      employeeService.updateEmployeeSalary(updateId,newSalary);
                    break;

                case 4:
                    int deleteId = InputUtil.getInt("Enter Employee ID to delete");
                    employeeService.deleteEmployeeById(deleteId);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}