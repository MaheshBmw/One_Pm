package flipkart.com;

public class Student_Details {
	
	//int a;
	
	public void student() { //Non-Paramterized method
    System.out.println("HELLO! I'M A STUDENT");
	}
	
	public void student(String a) {  //Paramterized method
    System.out.println(a);
	}
	
	public void student(int a) {
     System.out.println(a);
	}
	
	public void student(int c, String b) {
    System.out.println(c);
	}
	
	public void student(String b, int a) {
    System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Student_Details s=new Student_Details();
		s.student();
		s.student("Arthiha");
		s.student(10);
		s.student(10, null);
		s.student("Hello", 10);
	}
	

}
