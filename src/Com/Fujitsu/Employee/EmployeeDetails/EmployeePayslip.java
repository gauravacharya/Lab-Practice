package Com.Fujitsu.Employee.EmployeeDetails;

public class EmployeePayslip {
	int empId;
	String fName;
	String lName;
	Long phoneNo;
	double salary;
	
	
	public EmployeePayslip() {
	// 0 Parameterized 	constructor.
	}
	
	
	public EmployeePayslip(int empId, String fName, String lName, Long phoneNo, double salary) {
		// user defined constructor.
		
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
		this.salary=salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "EmployeePayslip empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", phoneNo=" + phoneNo
				+ ", salary=" + salary ;
	}
	
	
	
	
	

}
