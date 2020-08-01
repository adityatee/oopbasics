package excercisesBasic;

public class TestBook {
	
	public static void main(String[] args)
	{
		Author[] auth = new Author[2];
		auth[0] = new Author("aditya", "test@test.com", 'm');
		auth[1] = new Author("keerthi", "test2@test.com", 'f');
		
		Book firstBook = new Book("OOP Basics", auth, 20.99, 20);
		
		System.out.println(firstBook);
	}

}
