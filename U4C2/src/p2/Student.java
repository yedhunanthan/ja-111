package p2;

import java.util.Scanner;

public class Student<y> {

	private int roll;
	private String name;
	private String address;
	private int marks;
	
	public void setStudent (int x) {
		Student[] stu = new Student[x];
		for(int i=0;i<x;i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Name");
			name = scan.next();
			String a= name;
			System.out.println("Enter Roll Number");
			roll = scan.nextInt();
			System.out.println("Enter Address");
			address = scan.next();
			System.out.println("Enter Marks");
			marks = scan.nextInt();
			Student[] y= {name};
			stu[i]= y;
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
