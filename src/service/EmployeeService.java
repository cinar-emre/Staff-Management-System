package service;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
        System.out.println("Employee added: " + employee.getName() + " " + employee.getSurname());
    }

    public void listEmployees(){
        if (employeeList.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public void deleteEmployeeById(int id){
        Employee toRemove = null;
        for (Employee emp : employeeList){
            if (emp.getId() == id){
                toRemove = emp;
                break;
            }
        }

        if (toRemove != null) {
            employeeList.remove(toRemove);
            System.out.println("Employee removed: " + toRemove.getName() + " " + toRemove.getSurname());
        } else {
            System.out.println("No employee found with ID: " + id);
        }
    }

    public void updateEmployeeSalary(int id, double newSalary){
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.setSalary(newSalary);
                System.out.println("Salary updated for: " + emp.getName());
                return;
            }
        }
        System.out.println("Employee not found with ID: " + id);
    }


}
