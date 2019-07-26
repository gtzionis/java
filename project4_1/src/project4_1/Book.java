package project4_1;

public class Book extends Item {
	
	private String author;
	private double discount;
	
	public Book(String name, String description, double price, String anAuthor, double dis)
	{
		super(name,description,price);
		author = anAuthor;
		discount = dis;
	}
	
	public double calculateRetailPrice()
	{
		return (getPrice() - getPrice()*discount);
	}
	
	public void printLabel()
		{
			System.out.println("***** Book ******");
			System.out.println(getName() + " (" + getDescription() + ")");
			System.out.println(author);
			System.out.println(calculateRetailPrice() + " Euro");
		}
	

}
