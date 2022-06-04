package p1;

public interface X {
	
	void fun1();
	default void fun2() {
		System.out.println("Default void fun2 in X");
	}
	static void fun3() {
		System.out.println("Static void fun3 in X");
	}

}
