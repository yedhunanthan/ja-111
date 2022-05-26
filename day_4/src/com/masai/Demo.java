package com.masai;

public class Demo {
	static void Demo() {
		System.out.println("qwerty");
	}
	static void Demo(String s) {
		System.out.println("qwerty"+" "+s);
	}
	static void Demo(int i) {
		System.out.println("qwerty"+" "+i);
	}
	static void Demo(float f) {
		System.out.println("qwerty"+" "+f);
	}
	public static void main(String[] args) {
		Demo();
		Demo("rdgysdffgnisdfn");
		Demo(10);
		Demo(20f);
	}
}
