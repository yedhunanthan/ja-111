package com.masai;

public class Student {
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		if(roll == 0 && name == null && marks == 0) {
			System.out.println("no blank allowed");
		}
		else {
			System.out.println("Roll NO :"+roll);
			System.out.println("Name :"+name);
			System.out.println("Marks :"+marks);
		}
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.roll = 10;
		s1.name = "qwerty";
		s1.marks = 100;
		s1.displayStudentDetails();
		
		Student s2 = new Student();
		s2.roll = 20;
		s2.name = "ytrewq";
		s2.marks = 200;
		s2.displayStudentDetails();
		
	}
	

}
