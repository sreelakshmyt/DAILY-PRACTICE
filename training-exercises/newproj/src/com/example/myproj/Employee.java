package com.example.myproj;

public class Employee {
	private int Empid;
	private String Empname;
	private int Empsalary;
	public int getEmpid() {
		return Empid;
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", Empsalary=" + Empsalary + "]";
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public Employee(int empid, String empname, int empsalary) {
		
		Empid = empid;
		Empname = empname;
		Empsalary = empsalary;
	}
	public Employee() {}
	public int getEmpsalary() {
		return Empsalary;
	}
	public void setEmpsalary(int empsalary) {
		Empsalary = empsalary;
	}

}
