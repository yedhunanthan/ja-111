package p1;

public class ZImpl implements Z{

	@Override
	public void fun1() {
		System.out.println("Default void fun1 in X by ZImpl");
	}

	@Override
	public void funA() {
		System.out.println("Default void funA in Y by ZImpl");
		
	}

	@Override
	public void funz() {
		System.out.println("Default void funZ in Z by ZImpl");
		
	}
	

}
