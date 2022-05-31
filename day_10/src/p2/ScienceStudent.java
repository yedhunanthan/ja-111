package p2;

import java.util.Scanner;

public class ScienceStudent extends Student {
	
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;

	public double getPercentage() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name");
		name = scan.next();
		System.out.println("Enter Address");
		address = scan.next();
		System.out.println("Enter Marks for phisicsMarks");
		phisicsMarks = scan.nextInt();
		System.out.println("Enter Marks for chemistryMarks");
		chemistryMarks = scan.nextInt();
		System.out.println("Enter Marks for mathsMarks");
		mathsMarks = scan.nextInt();
		
		int sum = phisicsMarks+chemistryMarks+mathsMarks;
		sum /= 3;
			return sum;
	}
}
