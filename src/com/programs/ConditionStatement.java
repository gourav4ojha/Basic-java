package com.programs;

public class ConditionStatement {

	public static void main(String[] args) {
		
//		Simple if
		System.out.println();
		int a=10, b=20;
		if(a<b) System.out.println("Welcome");
		
//		if else
		System.out.println();
		  
		 if(b<0)System.out.println("negative");
		 else System.out.println("positive");
		 
		 if(a%2 == 0)System.out.println("Even");
		 else System.out.println("Odd");
		 
//		 else if
		 System.out.println();
		 String mob = "oppo";
		 if(mob.equals("vivo")) System.out.println("purchase viov");
		 else if(mob.equals("apple"))System.out.println("purchase apple");
		 else if(mob.equals("oppo"))System.out.println("purchase oppo");
		 else System.out.println("Exit from amazone");
		 
//		 nested if
		 System.out.println();
		 String username = "admin";
		 String password = "1234";
		 if(username == "admin")
			 if(password == "1234")
				 System.out.println("login sucess");
			 else System.out.println("invalid credentials");
		 
//		 Switch
		 System.out.println();
		 int day=3;
		 switch(day) {
		 case 1:
			 System.out.println("monday");
//			 break;
		 case 2:
			 System.out.println("tuesday");
//			 break;
		 case 3:
			 System.out.println("wednesday");
//			 break;
		default:
			System.out.println("default");
			
		 }
	}
}
