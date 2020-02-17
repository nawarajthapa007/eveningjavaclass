package conditional;

import java.util.Scanner;

public class SwitchOnOffStatement {
	public static void main(String[]args) {
		System.out.println("please select 1 or 2");
		Scanner sc =new Scanner(System.in);
		int value=sc.nextInt();
		
		switch(value) {
			case 1:
			System.out.println("The light is ON");
		break;
		case 2:
			System.out.println("The light is OFF");
			default:
				System.out.println("Invalied input");
		}
			
	}

}
