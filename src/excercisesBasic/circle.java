package excercisesBasic;

public class circle {
	//private instance variables not accessible from outside this class
	private String color;
	private double radius;
	
	//constructors overloaded
	/** first constructor with default values for instance variables - this is default constructor**/
	public circle() //default constructor tet
	{
		radius = 1.0;
		color = "red";
	}
	
	/** constructs circle instance with given radius and default color red **/
	public circle(double r) //second constructor 
	{
		radius = r;
		color = "red";
	}
	
	/**constructs circle instance with given radius and color */
	public circle(double radius, String color) // 3rd constructor 	
	{
		this.radius = radius;
		this.color = color;
	}
	/**returns the radius */
	public double getRadius()
	{
		return radius;
	}
	/** returns the color of the circle */
    public String getColor()
    {
    	return color;
    }
	/** returns the area of this circle instance */
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	/** Setter for instance variable radius */
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
    /** Setter for instance variable color */
	public void setColor(String color)
	{
		this.color = color;
	}
	/** return a self-descriptive string of this instance in the form of circle[radius = Q color = Q] */
	public String toString()
	{
		return "circle[radius = " +radius+ " color = " +color+ "]";
	}
}

