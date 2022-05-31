package p4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		generatePerson(new Student());

		generatePerson(new Instructor());

		}

	public static void generatePerson(Student s1) {
		s1.set();
		s1.get();
	}
	public static void generatePerson(Instructor s1) {
		s1.set();
		s1.get();
	}

}
class Person{
	
	String name;
	String gender;
}

class Address{
	 String city;
	 String state;
	 String pinCode;
}

class Instructor extends Person{
	 int instructorId;
	 int salary;
	 
		public void set() {
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter name");
			name = scan.next();
			System.out.println("Enter gender");
			gender = scan.next();
			
			System.out.println("Enter instructorId");
			instructorId = scan.nextInt();
			System.out.println("Enter salary");
			salary = scan.nextInt();
			
			Address ad = new Address();
			System.out.println("Enter city");
			ad.city = scan.next();
			System.out.println("Enter state");
			ad.state = scan.next();
			System.out.println("Enter pinCode");
			ad.pinCode = scan.next();
			
		}
		public void get() {
			
			System.out.println("Enter name"+name);
			System.out.println("Enter gender"+gender);
			System.out.println("Enter studentId"+instructorId);
			System.out.println("Enter courseEnrolled"+salary);
			
			Address ad = new Address();
			System.out.println("Enter city"+ad.city);
			System.out.println("Enter state"+ad.state);
			System.out.println("Enter pinCode"+ad.pinCode);
			
		}
}
class Student extends Person{
	 int studentId;
	 String courseEnrolled;
	 int courseFee;
	public void set() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter name");
		name = scan.next();
		System.out.println("Enter gender");
		gender = scan.next();
		System.out.println("Enter studentId");
		studentId = scan.nextInt();
		System.out.println("Enter courseEnrolled");
		courseEnrolled = scan.next();
		System.out.println("Enter courseFee");
		courseFee = scan.nextInt();
		
		Address ad = new Address();
		System.out.println("Enter city");
		ad.city = scan.next();
		System.out.println("Enter state");
		ad.state = scan.next();
		System.out.println("Enter pinCode");
		ad.pinCode = scan.next();
		
	}
	public void get() {
		
		System.out.println("Enter name"+name);
		System.out.println("Enter gender"+gender);
		System.out.println("Enter studentId"+studentId);
		System.out.println("Enter courseEnrolled"+courseEnrolled);
		System.out.println("Enter courseFee"+courseFee);
		
		Address ad = new Address();
		System.out.println("Enter city"+ad.city);
		System.out.println("Enter state"+ad.state);
		System.out.println("Enter pinCode"+ad.pinCode);
		
	}
}
