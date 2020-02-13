package Conditional;

public class ForLoopSExample {

	public static void main(String[] args) {
		for(int a=1;a<=50;a++) {
			if(a % 2==0) {
				System.out.println(a);
			}
		}
		for(int b=1;b<=50;b++) {
			if(b%2==1) {
				System.out.println(b);
			}
		}
	}

}