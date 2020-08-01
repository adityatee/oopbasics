package excercisesBasic;

public class MyCirlce {
	
	private MyPoint center = new MyPoint(0,0);
	private int radius;
	
	
	public MyCirlce()
	{
		this.radius = 0;
	}
	public MyCirlce(int x, int y, int radius)
	{
		center = new MyPoint(x, y);
		this.radius = radius; 
	}
	
	public int getRadius()
	{
		return radius;
	}
	public void setRadius(int radius)
	{
		this.radius = radius; 
	}
	
	public MyPoint getCenter()
	{
		return center;
	}
	
	public void setCenter(int x, int y)
	{
		center = new MyPoint(x, y);
	
	}
	public double distance(MyCirlce another)
	{
		return center.distance(another.center);
		
	}
	
	public String toString()
	{
		return "My Circle [radius = "+radius+", center = ("+center.getX()+","+center.getY()+")]";
	}
	


}
