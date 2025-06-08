package model;

public class Employee extends Person{

    private double salary;
    private String department;

    public Employee(int id, String name, String surname, String email, double salary, String department) {
        super(id, name, surname, email); // Person sınıfının constructor'ı çağrılıyor
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString metodu override
    @Override
    public String toString() {
        return super.toString() +
                ", Salary: " + salary +
                ", Department: " + department;
    }
}
