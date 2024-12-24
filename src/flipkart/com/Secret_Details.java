package flipkart.com;

public class Secret_Details extends Bank_Details{
	
	@Override
	public void atm_Pin() {
	System.out.println("1111");
	}
	
	@Override
	public void cvv_No() {
	System.out.println("1234");
	}
	
	public static void main(String[] args) {
		Secret_Details s=new Secret_Details();
		s.bank_Account_No();
		s.ifsc_Code();
		s.atm_Pin();
		s.cvv_No();
	}

}
