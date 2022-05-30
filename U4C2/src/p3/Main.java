package p3;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		Ola o1 = new Ola();
		Car myCar = o1.bookCar(x, y);
		int res = o1.calculateBill(myCar);

		System.out.println("The total fare amount is"+ res);
		}
}
