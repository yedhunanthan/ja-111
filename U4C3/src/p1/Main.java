package p1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int x = scan.nextInt();
			int[] arr = new int[x];
			System.out.println("Enter the elements in the array");
			for(int i:arr) {
				arr[i]= scan.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int y = scan.nextInt();
			System.out.println("The array element at index 1 ="+arr[y]);
			System.out.println("The array element successfully accessed");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch (NumberFormatException ea) {
			System.out.println("java.lang.NumberFormatException");
		}
	}
}
