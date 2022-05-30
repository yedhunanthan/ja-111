package p2;

import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
	private String address;
	private int marks;
	
	public void setStudent (int x) {
		Object[] stu = new Object[x];
		for(int i=0;i<x;i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Name");
			name = scan.next();
			System.out.println("Enter Roll Number");
			roll = scan.nextInt();
			System.out.println("Enter Address");
			address = scan.next();
			System.out.println("Enter Marks");
			marks = scan.nextInt();
			Object[] y= {name,roll,address,marks};
			stu[i]= y;
		}	
		for(int i=0;i<x;i++) {
			Object o1 = stu[i];
			
			System.out.println("Enter Name"+o1[i]);
			System.out.println("Enter Roll Number");
			System.out.println("Enter Address");
			System.out.println("Enter Marks");
		}
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}