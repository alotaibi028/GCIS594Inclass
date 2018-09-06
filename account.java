/**
 * Class Untitled
 */
 
 public class account{
 	private int accountNumber;
 	private float balance;
 	private String customerName;
 	
 	
 	account(){
 		customerName="Mohammed";
 		balance=100;
 		accountNumber=123;
 		
 	}
 	account(String cn, float iniD){
 	
 	
 	customerName=cn;
 	balance=iniD;
 	
 	}
 	
 	
 	public void deposit(int d){
 		
 		float sum;
 		sum=d+balance;
 		
 	}
 	
 	
 	
 	public String accountInfo()
 	{
 		return customerName+balance;
 	}
 	
 	
 	
 }

