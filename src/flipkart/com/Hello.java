package flipkart.com;

public class Hello implements Hi{

	@Override
	public void method() {
		System.out.println("PARENT");
	}

	@Override
	public void method1() {
		System.out.println("CHILD");
	}

	public static void main(String[] args) {
		Hello obj=new Hello();
		obj.method();
		obj.method1();
	}
}
