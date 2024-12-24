package flipkart.com;

public class Overload {

	public void student() {
    System.out.println("STUDENT");
	}
	public void student(int a) {
    System.out.println(a);
	}
	public void student(String a) {
    System.out.println(a);
	}
	public void student(int a, int b) {
    System.out.println(a+b);
	}
	public void student(int a, String b) {
    System.out.println(a+b);
	}
	public void student(String b, int a) {
    System.out.println(a);
	}
	
	public static void main(String[] args) {
		Overload obj=new Overload();
		obj.student();
		obj.student(0);
		obj.student("Arthi");
		obj.student(10, 20);
		obj.student(1, "Hi");
		obj.student("Hello", 10);
		
	}
	
}
