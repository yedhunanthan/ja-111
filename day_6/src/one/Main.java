package one;

import java.util.Scanner;

public class Main {
	
	public static String reversString(String str){
			String x = "";
			for(int i =str.length()-1;i>=0;i--) {
				x += str.charAt(i);
			}
			return x;
		}
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String to reverse");
			String a = sc.next();
			String result = reversString(a);
			System.out.println("Original String is :"+ a);
			System.out.println("Reversed String is :"+ result);
		}

}
