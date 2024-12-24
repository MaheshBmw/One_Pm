package flipkart.com;

public class Child implements Mom, Dad{

	@Override
	public void gift() {
		System.out.println("CAR");
	}

	@Override
	public void gift1() {
		System.out.println("CAR");
	}
	
	public static void main(String[] args) {
		Child obj=new Child();
		obj.gift();
		obj.gift1();
	}

}
