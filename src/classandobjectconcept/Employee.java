package classandobjectconcept;

public class Employee {
	String name;
	int salary;

	
		void canWork() {
			System.out.println("employee of this company can work:");
		}
		void displayEmployeeDetail(Employee employee) {
			System.out.println("the name is: "+ employee.name +" and the salary is:"+employee.salary );
		}
		public static void main(String[] args) {
			Employee e1 = new Employee();
			e1.name = "Aaron";
			e1.salary = 2000;
			e1.displayEmployeeDetail(e1);
			
			Employee e2= new Employee();
			e2.name="Sanjay";
			e2.salary=1500;
			e2.displayEmployeeDetail(e2);
				
		}

}
