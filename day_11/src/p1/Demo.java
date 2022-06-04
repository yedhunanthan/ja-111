package p1;

public class Demo {
	
	private void fun2() {
		System.out.println("Default void fun2 in x by Demo");
	}

	public static void main(String[] args) {
		X x = new ZImpl();
		x.fun1();
		Demo demo = new Demo();
		demo.fun2();
		X.fun3();
		
		Y y = (Y)x;
		y.funA();
		y.funB();
		Y.funC();
		
		Z z = (Z)y;
		z.fun1();
		z.fun2();
		z.funA();
		z.funB();
		z.funz();
		
	}
}
