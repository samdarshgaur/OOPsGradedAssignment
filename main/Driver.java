package main;

import departments.Admin;
import departments.HR;
import departments.Tech;

public class Driver {

	public static void main(String[] args) {
		Admin adminDepartment = new Admin();
		HR hrDepartment = new HR();
	        Tech techDepartment = new Tech();
		
	    
	        System.out.println("Welcome to " + adminDepartment.departmentName());
	        System.out.println(adminDepartment.getTodaysWork());
	    	System.out.println(adminDepartment.getWorkDeadline());
	    	System.out.println(adminDepartment.isTodayHoliday());
	    	System.out.println();
	    
	    	System.out.println("Welcome to " + hrDepartment.departmentName());
	    	System.out.println(hrDepartment.getTodaysWork());
	    	System.out.println(hrDepartment.getWorkDeadline());
	    	System.out.println(hrDepartment.doActivity());
	    	System.out.println(hrDepartment.isTodayHoliday());
	    	System.out.println();
	    
	    
	    	System.out.println("Welcome to " + techDepartment.departmentName());
	    	System.out.println(techDepartment.getTodaysWork());
	    	System.out.println(techDepartment.getWorkDeadline());
	    	System.out.println(techDepartment.getTechStackInfo());
	    	System.out.println(techDepartment.isTodayHoliday());
	    
	}

}
