package com.masai;

public class Student {
	int roll;
	String name;
	int marks;
	int age;
	
	void fun1() {
		if( age<60 && age>0 && marks>0 && marks<500) {
			
			System.out.println("Roll NO :"+roll);
			System.out.println("Name :"+name);
			System.out.println("Age :"+age);
			System.out.println("Marks :"+marks);
		}
		else {
			System.out.println("error");
		}
	}
	void fun1(int roll,String name,int marks,int age) {
		System.out.println(age);
		if( age<60 && age>0 && marks>0 && marks<500) {
			
			System.out.println("Roll NO :"+roll);
			System.out.println("Name :"+name);
			System.out.println("Age :"+age);
			System.out.println("Marks :"+marks);
		}
		else {
			System.out.println("error");
		}
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.roll = 10;
		s1.name = "qwerty";
		s1.age = 11;
		s1.marks = 100;
		s1.fun1();
		
		Student s2 = new Student();
		s2.roll = 20;
		s2.name = "ytrewq";
		s2.age = 22;
		s2.marks = 200;
		s2.fun1(s2.roll, s2.name, s2.marks, s2.age);
	}
	

}
