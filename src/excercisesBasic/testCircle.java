package excercisesBasic;


public class testCircle {
	public static void main(String[] args)
	{
		//declare instance of a circle class called c1
		//Construct the instance with the default constructor circle
		//which sets its radius and color to its default values trying 
		circle c1 = new circle();
		//invoke public methods on instance c1 via dot operator 
		System.out.println("Radius of Circle is" + c1.getRadius() + " & Area of the cirle is " + c1.getArea());
		
		//Declare the instance of the class called c2
		//Construct the instance with the 2nd constructor 
		//with the given radius and default color 
		circle c2 = new circle(2.0);
		//Invoke public methods on instance c2 via dot operator
		System.out.println("Caricle has radius of "+c2.getRadius() + " and area of " + c2.getArea() );
		
		circle c4 = new circle();  //construct instance of a circle using default constructor 
		c4.setRadius(4.5); //change radius value from default value given in constructor 
		System.out.println("New radius set is " + c4.getRadius());
		
		c4.setColor("blue"); //change color
		System.out.println("New color of the circle is " + c4.getColor());
		System.out.println(c4.toString());
		
		
		System.out.println("Circumference of the circle is " + c4.getCircumference());
		
		
	}

}
