package com.tns.ifet.assignment1;
import com.tns.ifet.assignment.employees.Manager;
import com.tns.ifet.assignment.employees.Developer;
import com.tns.ifet.assignment.utilities.EmployeeUtilities;
public class AssignmentMain
{
	 public static void main(String[] args)
	 {
		 Manager manager = new Manager("Josh", 101, 90000, "Sales");
		 Developer developer = new Developer("Alin", 102, 80000, "Java");
		 EmployeeUtilities.printEmployeeDetails(manager);
		 EmployeeUtilities.printEmployeeDetails(developer);
	 }
}
	


