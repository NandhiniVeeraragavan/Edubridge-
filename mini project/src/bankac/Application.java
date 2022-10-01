package bankac;

import java.util.Scanner;

public class Application {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
 		 System.out.println("How many number of customers do you want to insert?");
 		 int n=sc.nextInt();
 		 Account op[]=new Account[n];
 		 for(int i=0;i<op.length;i++) {
 			 op[i]=new Account();
 			 op[i].addacc();
 		 }
 		 int ch;
 		 do {
 			 System.out.println("\n***ABC BANK***");
 			 System.out.println("1.Display all account details \n 2.search by Account no \n 3.Deposit the amount \n 4.withdrawl \n 5.Exit");
 			 System.out.println("Enter the choice:");
 			 ch=sc.nextInt();
 			 switch (ch) {
 			 case 1:
 				 for(int i=0;i<op.length;i++) {
 					 op[i].displayacc();
 				 }
 				 break;
 			 case 2:
               System.out.println("Enter account no. you want to search:");
               String ac_no=sc.next();
               boolean found=false;
               for(int i=0;i<op.length;i++) {
            	   found=op[i].search(ac_no);
            	   if(found) {
            		   break;
            	   }
               }
               if(!found) {
            	   System.out.println("Search failed!");
            	   System.out.println("Account does not exit....!");
               }
               break;
 			 case 3:
 				 System.out.print("enter account no:");
 				 ac_no=sc.next();
 				 found= false;
 				 for(int i=0;i<op.length;i++) {
 					 found=op[i].search(ac_no);
 					 if(found) {
 						 op[i].deposit();
 						 break;
 					 }
 				 }
 				 if(!found) {
 					 System.out.println("Search failed!");
 	            	   System.out.println("Account does not exit....!");
 	               }
 				 break;
 			 case 4:
 				 System.out.print("Enter the account no:");
				 ac_no=sc.next();
				 found= false;
				 for(int i=0;i<op.length;i++) {
					 found=op[i].search(ac_no);
					 if(found) {
						 op[i].withdraw();
						 break;
					 }
				 }
				 if(!found) {
					 System.out.println("Search failed!");
	            	   System.out.println("Account does not exit....!");
	               }
				 break;
 			 case 5:
 				 System.out.println("\t\t\t***THANK YOU***");
 				 break;
 				 
 				 }
 					 
 				 }
 		 while(ch!=5);
 		 sc.close();
	  }
 				 
 		 }
     	
         
 

