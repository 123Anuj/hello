package com.CaseStudy;

public class Employee {

	String deptName;
	String name;
	String designation;
	double salary;
	int yearOfExperience;
	String adress;
	String company_name;
	
	public Employee(String deptName,String name,String designation,double salary,int yearOfExperience,String adress,String company_name){
		
		this.adress=adress;
		this.company_name=company_name;
		this.deptName=deptName;
		this.designation=designation;
		this.salary=salary;
		this.yearOfExperience=yearOfExperience;
		this.name=name;
	}
	
 
	protected void applyLeaves(){
		
	}
	
}
