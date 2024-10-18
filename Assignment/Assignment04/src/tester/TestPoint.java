package tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
		Point2D p1 = new Point2D(1,2);
		System.out.println("point"+p1.getDetails());
		Point2D p2 = new Point2D(3,4);
		System.out.println("point"+p2.getDetails());
		
		p1.accept();
		p2.accept();
		System.out.println("p1 coordinate"+p1.getDetails());
		System.out.println("p2 coordinate"+p2.getDetails());
		
		
		if(p1.isEqual(p2))
		{
			System.out.println("Points are same");
			System.out.println("point"+p1.getDetails());
			System.out.println("point"+p2.getDetails());
		}
		else
		{
			double cal=p1.calculateDistance(p2);
			System.out.println("Distance between p1 and p2 :"+ cal);
		}
	}

}
