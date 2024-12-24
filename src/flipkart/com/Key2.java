package flipkart.com;

public class Key2 extends Keywords{
   int age=40;
   
   public void hello() {
   System.out.println(this.age);//current class ref
   System.out.println(super.age);// parent class ref
}
   public static void main(String[] args) {
	Key2 obj=new Key2();
	obj.hello();
}
	
}
