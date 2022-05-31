package p4;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		int x = length*breadth;
		return x;
	}

	@Override
	public int squareArea(int side) {
		int x = side*side;
		return x;
	}

	@Override
	public double circleArea(int radius) {
		double x = 3.14*(radius*radius);
		return x;
	}

}
