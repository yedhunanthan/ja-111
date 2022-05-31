package p2;

import java.util.Scanner;

public class HistoryStudent extends Student {
	int historyMarks;
	int civicsMarks;
	
	public double getPercentage() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name");
		name = scan.next();
		System.out.println("Enter Address");
		address = scan.next();
		System.out.println("Enter Marks for historyMarks");
		historyMarks = scan.nextInt();
		System.out.println("Enter Marks for civicsMarks");
		civicsMarks = scan.nextInt();
		
		int sum = historyMarks+civicsMarks;
		sum /= 2;
		return sum;
	}

}
