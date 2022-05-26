package com.masai;

class help {

	public static void print(int a) {
		if(a<0) {
			System.out.println("Error");
		}
		if(a%2==0) {
			System.out.println("a");
		}
		else {
			for(int i=0;i<11;i++) {
				if(a/10==0) {
					System.out.println("a");
				}
				a++;
			}
		}
	}
}
class Main{
	public static void main(String[] args) {
		int a = 50;
		int b = 45;
		int c = -5;
		help.print(a);
		help.print(b);
		help.print(c);
	}
}
