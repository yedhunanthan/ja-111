package p1;

public interface Y {

	void funA();
	default void funB() {
		System.out.println("Default void fun2 in y");
	}
	static void funC() {
		System.out.println("Static void fun3 in y");
	}
}
