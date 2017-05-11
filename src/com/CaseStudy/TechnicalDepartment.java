package com.CaseStudy;

public class TechnicalDepartment extends Department{

	static String deptId="Tech_102";
	int noOfEmployees;
	@Override
	void doWork() {
		// TODO Auto-generated method stub
		System.out.println("The technical department works on the Technical part ");
	}

	protected boolean approveLeaves(String empId,String typeOfLeave,int noOfdays){
		
		
		return true;
	}
	protected void giveIncentives(String empId){
		
	}

}
