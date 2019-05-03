package test.MentoriatPoint;

public class PointTest {
	public static void main(String[] args) {
		Point p1 = new Point(1, 12);
		Point p2 = new Point(1, 15);
		// p1.flip();
		System.out.println(p1.quadrant() + " " + p1.distance(p2)+ " "+p1.distanceToOrigin());
	}
}
