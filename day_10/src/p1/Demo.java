package p1;

import java.util.Scanner;
import java.util.concurrent.Executor;

public class Demo {

	public Hotel provideFood(int amount) {
		
		 if(amount>200 && amount<1000) {
			Hotel h1 = new RoadSideHotel();
			return h1;
		}
		 else {
			 Hotel h1 = new TajHotel();
			return h1;
		 }
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		if(x<199) {
			System.out.println("Please Enter a valid amount;");
		}else {
			Demo d1 = new Demo();
			Hotel h1 = d1.provideFood(x);
			if(h1 instanceof  TajHotel) {
				((TajHotel) h1).welcomeDrink();
				h1.chickenBiryani();
			}
			else {
				h1.masalaDosa();
			}
		}
	}
}
