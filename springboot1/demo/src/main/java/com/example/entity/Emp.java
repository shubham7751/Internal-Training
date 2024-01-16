package com.example.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emp {
	
	@Column
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String empCity;
	private int empSalary;
	
	
	
	public Emp(int empId, String empName, String empCity, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.empSalary = empSalary;
		
		}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", empSalary=" + empSalary
				+ "]";
	}
	
	
	
	
	

}

