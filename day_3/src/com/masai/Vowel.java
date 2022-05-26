package com.masai;

import java.util.regex.Pattern;

public class Vowel {

	String[] el = {"a","e","i","o","u"};
	void fun1(String y) {
		if(Pattern.matches("[a-zA-Z]+",y)) {
			String x = y.toLowerCase();
			int c=0;
			for( int i = 0; i < el.length ; i++)
			{
				if(x.equals(el[i])) {
					System.out.println("vowel");
					c++;
				}
				
			}
			if(c==0) {
				System.out.println("consonant");
			}
		}
		else
				System.out.println("invalid character");
	}
	
	public static void main(String[] args) {
		Vowel v1 = new Vowel();
		v1.fun1("u");
		v1.fun1("B");
		v1.fun1("@");
		v1.fun1("E");

	}
}
