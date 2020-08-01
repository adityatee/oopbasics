package excercisesBasic;

public class TestMyPoint {
	
	public static void main(String[] args)
	{
		MyPoint p1 = new MyPoint(2,6);
		System.out.println(p1.getXY());
		System.out.println(p1.getXY()[0]);
		System.out.println(p1.getXY()[1]);
		System.out.println(p1.distance(4, 7));
	}

}
