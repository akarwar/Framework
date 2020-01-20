package recap;

public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		
		
		emp1.setEmplId(105);
//		emp1.setEmplName("Hars");
		emp1.setSalary(9000);
		emp1.setBonus(200);
		emp1.setGender('M');
		
		Employee emp2 = new Employee();
		
		
		emp2.setEmplId(109);
//		emp2.setEmplName("shah");
		emp2.setSalary(6000);
		emp2.setBonus(100);
		emp2.setGender('F');
		
		System.out.println(emp1);
		System.out.println(emp2);

	}

}
