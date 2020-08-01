package excercisesBasic;

public class Invoice {
	
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id, Customer customer, double amount)
	{
		this.id = id;
		this.customer = customer;
		this.amount = amount;	
	}

	public int getID()
	{
		return id;
	}
	public Customer getCustomer()
	{
		return customer;
	}
	
	public void setCustomer(int id, String name, int discount)
	{
		customer = new Customer(id, name, discount);
	}
	
	public double getAmount()
	{
		return amount;
	}
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	
	public String getCustomerName()
	{
		return customer.getName();
	}
	
	public double getAmountAfterDiscount()
	{
		return getAmount()-customer.getDiscount();
	}
}
