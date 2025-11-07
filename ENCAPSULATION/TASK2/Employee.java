package ENCAPSULATION.TASK2;

public class Employee {
	
	    private String empId;
	    private String name;
	    private double baseSalary;
	    private double bonusPercentage;

	    
	    public Employee(String empId, String name, double baseSalary, double bonusPercentage) {
	        this.empId = empId;
	        this.name = name;
	        setBaseSalary(baseSalary);
	        setBonusPercentage(bonusPercentage); 
	    }

	    
	    public String getEmpId() {
	        return empId;
	    }

	    public void setEmpId(String empId) {
	        this.empId = empId;
	    }

	    
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    
	    public double getBaseSalary() {
	        return baseSalary;
	    }

	    public void setBaseSalary(double baseSalary) {
	        if (baseSalary > 0) {
	            this.baseSalary = baseSalary;
	        } else {
	            System.out.println("Base salary cannot be negative or zero.");
	        }
	    }

	    
	    public double getBonusPercentage() {
	        return bonusPercentage;
	    }

	    public void setBonusPercentage(double bonusPercentage) {
	        if (bonusPercentage >= 0 && bonusPercentage <= 100) {
	            this.bonusPercentage = bonusPercentage;
	        } else {
	            System.out.println("Bonus percentage must be between 0 and 100.");
	        }
	    }

	 
	    public double getGrossSalary() {
	        return baseSalary + (baseSalary * bonusPercentage / 100);
	    }

	    
	    public void applyBonus(double departmentPerformance) {
	        if (departmentPerformance >= 0 && departmentPerformance <= 100) {
	            if (departmentPerformance > 80) {
	                bonusPercentage = 10; // 10% bonus for high department performance
	            } else if (departmentPerformance > 50) {
	                bonusPercentage = 5; // 5% bonus for average department performance
	            } else {
	                bonusPercentage = 2; // 2% bonus for low department performance
	            }
	        } else {
	            System.out.println("Department performance must be between 0 and 100.");
	        }
	    }

	 
	    public void updateSalary(double newBaseSalary) {
	        setBaseSalary(newBaseSalary); 
	    }
	    public static void main(String[] args) {
	    	 Employee emp1 = new Employee("E001", "Alice", 50000, 8);
	         Employee emp2 = new Employee("E002", "Bob", 60000, 5);
	         Employee emp3 = new Employee("E003", "Charlie", 45000, 6);


	         emp1.applyBonus(85); 
	         emp2.applyBonus(70); 
	         emp3.applyBonus(45); 
	        
	         emp1.updateSalary(55000);
	         emp2.updateSalary(65000); 
	         System.out.println(emp1.getName() + "'s Updated Salary: " + emp1.getGrossSalary());
	         System.out.println(emp2.getName() + "'s Updated Salary: " + emp2.getGrossSalary());
	         System.out.println(emp3.getName() + "'s Updated Salary: " + emp3.getGrossSalary());
	     }
		}
	



