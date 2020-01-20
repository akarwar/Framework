package encapsulation;

public class EmployeeData {
	// Encapsulation is also called data hiding or binding of data with help of methods
	//How to implement Encapsulation
	
	// 1. Private data variables: so that these Variables can not accessed directly from outside the class
	private int ssn;
	private String empName;
	private int empAge;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData emp = new EmployeeData();
		emp.setEmpAge(35);
		emp.setEmpName("Ahmad");
		emp.setSsn(123654);
		
		System.out.println("Employee Age is: "+emp.getEmpAge());
		System.out.println("Employee name is: "+emp.getEmpName());
		System.out.println("Employee SSN is: "+emp.getSsn());
	// 2. getter and setter methods: to set and get the values of the fields	
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
