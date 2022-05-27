package p1;

import java.util.Scanner;

public class Member {
	  String Name;
	  int Age ;
	 String Phone_number ;
	  String Address;
	  double Salary;
	 
	 void printSalary() {
		 System.out.println("Salary :"+Salary);
	 }
}
	 class Employee extends Member {
		 String Specialisation ;
		 String Department ;
		 
		 public void setMember(){
				Scanner scan = new Scanner(System.in);
				 System.out.println("Enter Name :");
				 Name = scan.next();
				 System.out.println("Enter Age :");
				 Age = scan.nextInt();
				 System.out.println("Enter Phone Number :");
				 Phone_number = scan.next();
				 System.out.println("Enter Address :");
				 Address = scan.next();
				 System.out.println("Enter Salary :");
				 Salary = scan.nextDouble();
				 System.out.println("Enter Specialisation :");
				 Specialisation = scan.next();
				 System.out.println("Enter Department :");
				 Department = scan.next();
			 }
			 public void getMember(){
				 System.out.println("Enter Name :"+Name);
				 System.out.println("Enter Age :"+Age);
				 System.out.println("Enter Phone Number :"+Phone_number);
				 System.out.println("Enter Address :"+Address);
				 System.out.println("Enter Salary :"+Salary);
				 System.out.println("Enter Specialisation :"+Specialisation);
				 System.out.println("Enter Department :"+Department);
			 }
	 }
	 class Manager extends Member {
		 String Specialisation ;
		 String Department ;
		 
		 public void setMember(){
				Scanner scan = new Scanner(System.in);
				 System.out.println("Enter Name :");
				 Name = scan.next();
				 System.out.println("Enter Age :");
				 Age = scan.nextInt();
				 System.out.println("Enter Phone Number :");
				 Phone_number = scan.next();
				 System.out.println("Enter Address :");
				 Address = scan.next();
				 System.out.println("Enter Salary :");
				 Salary = scan.nextDouble();
				 System.out.println("Enter Specialisation :");
				 Specialisation = scan.next();
				 System.out.println("Enter Department :");
				 Department = scan.next();
			 }
			 public void getMember(){
				 System.out.println("Enter Name :"+Name);
				 System.out.println("Enter Age :"+Age);
				 System.out.println("Enter Phone Number :"+Phone_number);
				 System.out.println("Enter Address :"+Address);
				 System.out.println("Enter Salary :"+Salary);
				 System.out.println("Enter Specialisation :"+Specialisation);
				 System.out.println("Enter Department :"+Department);
			 }
	 }	

