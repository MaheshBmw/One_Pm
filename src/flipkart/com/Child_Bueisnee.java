package flipkart.com;

public class Child_Bueisnee extends Parent_Business1{

	@Override
	public void hotel() {
	System.out.println("AC");
	System.out.println("3 MEALS");
	System.out.println("MULIT CUISINE");
	}
	
	public static void main(String[] args) {
		Child_Bueisnee obj=new Child_Bueisnee();
		obj.hotel();
	}
}
