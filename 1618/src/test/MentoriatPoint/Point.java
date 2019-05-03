package test.MentoriatPoint;

public class Point {
	private double x;
	private double y;

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public int quadrant() {
		int[] arr = { 3, 1, 2, 4 };
		int x = (this.x > 0) ? 1 : 0;
		int y = (this.y > 0) ? 1 : 0;
		return arr[(x << 1) + y];
	}

	public void flip() {
		double puffer = x;
		x = -y;
		y = -puffer;
	}

	public double distance(Point other) {
		return Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2));
	}

	public double distanceToOrigin() {
		return distance(new Point(0, 0));
	}
}
