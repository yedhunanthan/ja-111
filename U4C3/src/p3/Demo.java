package p3;

import java.util.Scanner;

public class Demo {


	public void showDetails(Month m) {
		switch (m) {
		case JAN:
			System.out.println("This is the 1st Month of the Year");
			break;
		case FEB:
			System.out.println("This is the 2st Month of the Year");
			break;
		case MAR:
			System.out.println("This is the 3st Month of the Year");
			break;
		case APR:
			System.out.println("This is the 4st Month of the Year");
			break;
		case MAY:
			System.out.println("This is the 5st Month of the Year");
			break;
		case JUN:
			System.out.println("This is the 6st Month of the Year");
			break;
		case JUL:
			System.out.println("This is the 7st Month of the Year");
			break;
		case AUG:
			System.out.println("This is the 8st Month of the Year");
			break;
		case SUB:
			System.out.println("This is the 9st Month of the Year");
			break;
		case OCT:
			System.out.println("This is the 10st Month of the Year");
			break;
		case NAV:
			System.out.println("This is the 11st Month of the Year");
			break;
		case DEC:
			System.out.println("This is the 12st Month of the Year");
			break;
		default:
			System.out.println("Invalid Month Name");
			break;
		}
	}
	
	public static void main(String[] args) {
		try {
			Demo d = new Demo();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Month");
		String m = scan.next();
		for(Month c: Month.values());
		if(m.equals(m))
			d.showDetails(null);
		}catch (Exception e) {
			System.out.println("Invalid Month Name");
		}
		
			
	}
}
