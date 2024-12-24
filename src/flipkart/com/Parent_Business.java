package flipkart.com;

public class Parent_Business {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			if (i==5) {
				continue;  //skip
			}
			System.out.println(i);
		}
	}
	
}
