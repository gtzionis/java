package project4_1;

public abstract class Item {
	
	private String name;
	private String description;
	private double price;
	
	public Item(String name, String description, double price) {

		this.name = name;
		this.description = description;
		this.price = price;
		
	}

	public abstract void printLabel();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
