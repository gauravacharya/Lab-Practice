package Com.Fujitsu.Employee.EmployeeDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTestClass {

	public static void main(String[] args) {
		List<EmployeePayslip> list= new ArrayList<EmployeePayslip>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many employee details do you have: ");
		int count= sc.nextInt();
		System.out.println("Enter employee detalis:empID, First name, Last name");
		System.out.println("Phone numer, HRA, TA, Basic and PF contribution :");
		for (int i = 0; i < count; i++) {
			System.out.println("Enter employee number : "+ i+1);
			int empID=sc.nextInt();
			String fName=sc.next();
			String lName=sc.next();
			long phno=sc.nextLong();
			int hra=sc.nextInt();
			int basic=sc.nextInt();
			int ta=sc.nextInt();
			int pf=sc.nextInt();
			double salary=calculateSalary(hra,ta,basic,pf);
			list.add(new EmployeePayslip(empID,fName,lName,phno,salary));
		}
				
		for (EmployeePayslip eps : list) {
			System.out.println("Employee Detals: ");
			System.out.println("Employee ID: "+eps.getEmpId());
			System.out.println("Employee First Name: "+eps.getfName());
			System.out.println("Employee Last Name: "+eps.lName);
			System.out.println("Employee Salary: "+eps.salary);
		}
	}

	 static double calculateSalary(int hra, int ta, int basic, int pf) {
		double salary= basic+hra+ta-basic*0.15;
		return salary;
	}

}
