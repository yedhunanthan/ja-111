package p2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no: of students");
		int x = scan.nextInt();
		Student[] arr = new Student[x];
		for(int i=0;i<x;i++) {
			Student i1 = new Student();
			i1.setStudent();
			arr[i]= i1;
		}
		for(int i=0;i<x;i++) {
			System.out.println("Name "+arr[i].getName());
			System.out.println("Roll number "+arr[i].getRoll());
			System.out.println("Address "+arr[i].getAddress());
			System.out.println("Marks "+arr[i].getMarks());
			System.out.println("-----------------");
		}
		Student s = new Student();
		System.out.println(s.avg(x, arr));

		
    }
}
