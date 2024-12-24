package flipkart.com;

public class Varaibles {
	
	static int b;            //STATIC VARIABLE
	
	public static void Hello() {
     int a=10;          //LOCAL VARIABLE
		b=10;
		System.out.println(a);
     System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println(b);
		Hello();
		System.out.println(b);
	}

}
