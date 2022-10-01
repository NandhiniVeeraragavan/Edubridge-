package bankac;
import java.util.*;
public class Account {
	 String name,acc_type,accno="";
	 long balance,Phone_no;
	 Scanner sc=new Scanner(System.in);
	// to add an account
	public  void addacc() {
		System.out.print("Enter Account No: ");  
        accno = sc.next();
        System.out.println("Enter Phone No:");
        Phone_no = sc.nextLong();
        System.out.print("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
	}
	//to display the details
	
	public  void displayacc() {
		 System.out.println("Name of account holder: " + name);  
	        System.out.println("Account no.: " + accno);  
	        System.out.println("Account type: " + acc_type);  
	        System.out.println("Balance: " + balance);
	        System.out.println("Phone No:"+ Phone_no);
	}
	//to deposit money
	public  void  deposit() {
       Scanner s=new Scanner(System.in);
      	long amt;   
       	System.out.println("enter the amount you want to deposit:");
       	amt=s.nextLong();
       	balance=balance+amt;
       	s.close();
       	System.out.println("Your amount was deposited!!");
	}
	//to withdraw money
      public  void withdraw() {
    	  Scanner sa=new Scanner(System.in);
        	long amt;  
    	   System.out.println("Enter the amount you want to withdraw:");
    	   amt=sa.nextLong();
    	   if(balance>=amt) {
    		   balance=balance-amt;
    		   sa.close();
    		   System.out.println("Balance after Withdraw:"+balance);
    	   }
    	   else {
    		   System.out.println("Your balance is less than"+amt);
    		   System.out.println("TRANSACTION FAILED");
    	   }
    	
      }
    //to search by account no
      public boolean search(String ac_no) {
    	  if (accno.equals(ac_no)) {
    		  displayacc();
    		  return(true);
      }
    	  return(false);
}
}
	
   
        
        
    
    

