package p4;

public class Main {

	public static void main(String[] args) {
		Area a1 = new Area();
		Double a = a1.circleArea(3);
		System.out.println("circleArea = "+a);
		int b = a1.squareArea(4);
		System.out.println("squareArea = "+b);
		int c = a1.rectangleArea(3, 4);
		System.out.println("rectangleArea ="+c);

	}

}
