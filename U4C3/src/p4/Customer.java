package p4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {

	String username; 
	String password;
	String mobileNumber;
	String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCoustomer() {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		Pattern p = Pattern.compile("[6789]{1}[\\d]{9}");
		Matcher m = p.matcher(a);
		mobileNumber = a;
		System.out.println(mobileNumber);
	}
}
