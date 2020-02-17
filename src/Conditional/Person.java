package conditional;

	class Student {
		int roll=16;
		void displayB() {
			System.out.println("roll is ");
		}
	}
	
	public class Person extends Student {
		String name="Mr.Brown";
		
		void display() {
			System.out.println("name is ");
		}
		void displayResult() {
			System.out.println("the name is "+name+"the roll is "+roll);
			
		}
	
	public static void main(String[] args) {
		Person a=new Person();
		a.display();
		a.displayB();
		

	}

}
