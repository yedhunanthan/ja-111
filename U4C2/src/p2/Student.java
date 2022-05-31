package p2;

import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
	private String address;
	private int marks;
	
	public void setStudent () {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Name");
			name = scan.next();
			System.out.println("Enter Roll Number");
			roll = scan.nextInt();
			System.out.println("Enter Address");
			address = scan.next();
			System.out.println("Enter Marks");
			marks = scan.nextInt();
	}
	public int avg(int x,Student arr[]) {
		int sum =0;
		for(int i=0;i<x;i++) {
			sum += arr[i].getMarks();
		}
		sum /=x;
		return sum;
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