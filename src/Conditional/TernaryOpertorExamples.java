package conditional;

public class TernaryOpertorExamples {

	public static void main(String[] args) {
		int a=25;
		String result="";
//		if (a<32) {
//			result="fail";
//		}
//		else {
//			result="pass";
//		}
//		System.out.println(result);
		result=a>=32?"pass":"fail";
		System.out.println(result);
	}

}
