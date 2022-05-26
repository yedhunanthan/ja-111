package com.masai;

public class Day_3_4 {
	public static void main(String[] args) {
		int a = 50;
		int b = 45;
		int c = -5;
		one.print(a);
		one.print(b);
		one.print(c);
	}

}
class one {

	public static void print(int a) {
		if(a<0) {
			System.out.println("Error");
		}
		else if(a%2==0) {
			System.out.println(a);
		}
		else {
			for(int i=0;i<11;i++) {
				if(a%10==0) {
					System.out.println(a);
					break;
				}
				a++;
			}
		}
	}
}
