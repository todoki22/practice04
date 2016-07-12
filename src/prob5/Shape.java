package prob5;

public abstract class Shape {
	private int countSides;

	public Shape( int countSides ) {
		this.countSides = countSides;
	}
	
	public int getCountSides() {
		return countSides;
	}

	public void setCountSides(int countSides) {
		this.countSides = countSides;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
}
