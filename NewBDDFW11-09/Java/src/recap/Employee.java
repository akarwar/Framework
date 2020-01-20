package recap;

public class Employee {
	
	private int emplId;
	private String emplName;
	private int salary;
	private int bonus;
	private char gender;

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		
		emp.setEmplId(101);
		emp.setEmplName("Harsha");
		emp.setSalary(2000);
		emp.setBonus(500);
		emp.setGender('F');
		
		
		System.out.println(emp.gender);
		System.out.println(emp.getEmplId());
		System.out.println(emp.getEmplName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getBonus());
		


		

	}

	public int getEmplId() {
		return emplId;
	}

	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}

	public String getEmplName() {
		return emplName;
	}

	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", emplName=" + emplName + ", salary=" + salary + ", bonus=" + bonus
				+ ", gender=" + gender + "]";
	}
	
	

}
