package com.CaseStudy;

public class ManagementDepartment extends Department{

	static String deptId="MGMT_101";
	int noOfEmployees;
	@Override
	void doWork() {
		// TODO Auto-generated method stub
		System.out.println("The management department will work on the Management process");
	}
	
	protected boolean approveLeaves(String empId,String typeOfLeave,int noOfdays){
		
		
		return true;
	}
	protected void giveIncentives(String empId){
		
	}

}
