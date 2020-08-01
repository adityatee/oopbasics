package excercisesBasic;

public class TestMyCircle 
{
	public static void main(String[] args)
	{
		MyCirlce newCir = new MyCirlce(3,6,5);
		System.out.println(newCir.distance(new MyCirlce(8,9,10)));
		System.out.println(newCir.toString());
	}

}
