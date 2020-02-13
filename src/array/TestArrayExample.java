package array;

public class TestArrayExample {

	public static void main(String[] args) {
		int a[]= {88,112,14,25,35,48,44,99,2,111};
		int large=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
System.out.println("the largest among 10 number is:"+large);
	}

}
