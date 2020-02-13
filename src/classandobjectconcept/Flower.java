package classandobjectconcept;

public class Flower {
	String name;
	String color;
	int price;
	
	void smellsGood() {
		System.out.println("it smells good:");
	}
	
	void displyFlowerDetail(Flower flower) {
		System.out.println("flower name is: "+flower.name+" which color is :"+flower.color+" and the price is :"+flower.price);
	}

	public static void main(String[] args) {
		Flower f1=new Flower();
		f1.smellsGood();// calling method
		
		f1.name="Rose";
		f1.color="Red";
		f1.price=20;
		f1.displyFlowerDetail(f1);
		

	}

}
