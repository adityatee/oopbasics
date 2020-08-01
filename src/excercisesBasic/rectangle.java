package excercisesBasic;

public class rectangle {
	
	private float length = 1.0f;
	private float width = 1.0f;
	
	/** default constructor with default values */
	public rectangle()
	{
		
	}
	/** Constructor with length and width as instance variables */
	public rectangle(float length, float width)
	{
		this.length = length;
		this.width = width;
	}

	/** get value for length */
	public float getLength()
	{
		return length;
	}
	
	/** set value for length */
	public void setlength(float length)
	{
		this.length = length;
		
	}
	
	/** get value for width */
	public float getwidth()
	{
		return width;
	}
	
	/** set value for width */
	public void setWidth(float width)
	{
		this.width = width;
	}
	
	/**This method calculates perimeter of an instance of the rectangle*/
	public float getPerimeter()
	{
		return 2 * (length + width);
	}
	
	/** This method calculates area of a instance of the rectangle */
	public float getArea()
	{
		return 2 * length * width;
	}
	public String toString()
	{
		return "Rectangle [length = "+length+"] width = "+width+"]";
	}
}
