package Inheritance.TASK1;

import java.util.ArrayList;
import java.util.List;

abstract class Employee{
	
	    protected int empId;
	    protected String name;
	    protected double salary;

	    public Employee(int empId, String name, double salary) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	    }

	    public abstract double calculateSalary();

	    public void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + calculateSalary());
	    }
	}

	class Department {
	    private String departmentName;
	    private List<Employee> employees;

	    public Department(String departmentName) {
	        this.departmentName = departmentName;
	        this.employees = new ArrayList<>();
	    }

	    public void addEmployee(Employee emp) {
	        employees.add(emp);
	    }

	    public String getDepartmentName() {
	        return departmentName;
	    }

	    public List<Employee> getEmployees() {
	        return employees;
	    }
	}

	class Manager extends Employee {
	    private String department;

	    public Manager(int empId, String name, double salary, String department) {
	        super(empId, name, salary);
	        this.department = department;
	    }

	    @Override
	    public double calculateSalary() {
	        
	        return salary + (salary * 0.2); 
	    }

	    @Override
	    public void displayEmployeeDetails() {
	        super.displayEmployeeDetails();
	        System.out.println("Department: " + department);
	    }
	}

	class Engineer extends Employee {
	    private String project;

	    public Engineer(int empId, String name, double salary, String project) {
	        super(empId, name, salary);
	        this.project = project;
	    }

	    @Override
	    public double calculateSalary() {
	        
	        return salary + (salary * 0.15); 
	    }

	    @Override
	    public void displayEmployeeDetails() {
	        super.displayEmployeeDetails();
	        System.out.println("Project: " + project);
	    }
	}

	class SalesExecutive extends Employee {
	    private double salesAchieved;

	    public SalesExecutive(int empId, String name, double salary, double salesAchieved) {
	        super(empId, name, salary);
	        this.salesAchieved = salesAchieved;
	    }

	    @Override
	    public double calculateSalary() {
	        
	        double commission = salesAchieved * 0.05; 
	        return salary + commission;
	    }

	    @Override
	    public void displayEmployeeDetails() {
	        super.displayEmployeeDetails();
	        System.out.println("Sales Achieved: " + salesAchieved);
	    }
	}

	
	class Company {
	    private List<Employee> employees;

	    public Company() {
	        this.employees = new ArrayList<>();
	    }

	   
	    public void addEmployee(Employee emp) {
	        employees.add(emp);
	    }

	    public double calculateTotalSalaries() {
	        double totalSalary = 0;
	        for (Employee emp : employees) {
	            totalSalary += emp.calculateSalary();
	        }
	        return totalSalary;
	    }

	    public void displayAllEmployees() {
	        for (Employee emp : employees) {
	            emp.displayEmployeeDetails();
	            System.out.println("----------------------------");
	        }
	    }
	}

	public class EmployeeSystem {
	    public static void main(String[] args) {
	        
	        Employee manager = new Manager(101, "Alice", 80000, "HR");
	        Employee engineer = new Engineer(102, "Bob", 60000, "Project X");
	        Employee salesExec = new SalesExecutive(103, "Charlie", 50000, 200000);

	       
	        Company company = new Company();
	        company.addEmployee(manager);
	        company.addEmployee(engineer);
	        company.addEmployee(salesExec);

	        company.displayAllEmployees();

	        System.out.println("Total Salary Expenses: " + company.calculateTotalSalaries());
	    }
	}


