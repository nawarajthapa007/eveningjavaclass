package conditional;

public class Animal {
	String name;
	int age;
	String color;
	
	Animal(String n,int a,String c) {
		name=n;
		age=a;
		color=c;
	}
	Animal(){
		
	}
	

	void display(Animal a) {
		System.out.println("The name of the animal is "+a.name+" age is "+a.age+" and the color is "+a.color);
		
	}
	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.name="cow";
		animal.age=5;
		animal.color="brown";
		animal.display(animal);
		Animal animal1=new Animal("rat",2,"black");
		animal1.display(animal1);
		
		
	}

}
