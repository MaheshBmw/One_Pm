package flipkart.com;

import amazon.com.Oops_Program;
import amazon.com.StudentDetails;

public class Student {
	
	public void student_Id() {
    System.out.println("TC001");
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.student_Id();
		Oops_Program obj= new Oops_Program();
		obj.student_Name();
		obj.student_Age();
		StudentDetails s1=new StudentDetails();
		s1.student_Dob();
	}
}
