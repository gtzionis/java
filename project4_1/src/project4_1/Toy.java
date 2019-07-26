package project4_1;

public class Toy extends Item {
	
	private int age;
	private boolean imported;
	
	public Toy(String name, String description, double price, int anAge, boolean imp)
	{
		super(name,description,price);
		age = anAge;
		imported = imp;
	}
	
	public double calculateRetailPrice()
	{
		if ( !imported ) // imported == false
		{
			return getPrice();
		}
		else
		{
			return (getPrice() + getPrice()*0.20);
		}
	}
	
	public void printLabel()
	{
		System.out.println("***** Toy ******");
		System.out.println(getName() + " (" + getDescription() + ")");
		System.out.println("Age " + age + "+");
		System.out.println(calculateRetailPrice() + " Euro");
	}
	

}
