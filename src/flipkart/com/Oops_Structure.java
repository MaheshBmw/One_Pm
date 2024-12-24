package flipkart.com;

public class Oops_Structure {
	
	//METHOD
	public void my_Name() {         //paramter - int a
    System.out.println("Arthiha");
	}
	
	//NON- PARAMETERIZED METHOD
	public void my_Age() {
    System.out.println("10");
	}
	//PARAMETERIZED METHOD
	public void my_First_Letter(char letter) {
     System.out.println(letter);
	}
	
	//MAIN METHOD
	public static void main(String[] args) {
	//OBJECT
		Oops_Structure obj=new Oops_Structure();
	//METHOD CALLING
		obj.my_Name();
		obj.my_Age();
		obj.my_First_Letter('A');
	}

}
