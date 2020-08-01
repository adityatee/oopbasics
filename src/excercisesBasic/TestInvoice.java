package excercisesBasic;

public class TestInvoice {
	
	public static void main(String[] args)
	{
		Invoice iv1 = new Invoice(01, new Customer(01, "Aditya", 20), 50);
		System.out.println(iv1.getAmount());
		System.out.println(iv1.getAmountAfterDiscount());
		System.out.println(iv1.getCustomerName());
		System.out.println(iv1.getCustomer());
	}

}
