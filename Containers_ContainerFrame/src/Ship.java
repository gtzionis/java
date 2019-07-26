import java.util.ArrayList;

public class Ship {
	
	private String name;
	private int capacity;
	
	private ArrayList<Container> containers;

	public String getName() {
		return name;
	}

	public Ship(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		containers = new ArrayList<Container>();
	}
	
	public void addContainer(Container aContainer) {
		if( containers.size() < capacity) {
			containers.add(aContainer);
			System.out.println("Container loaded");
		}
		else 
			System.out.println("Sorry, the ship is full");	
	}
	
	public double calcTotalCharge() {
		
		double sum = 0;
		for(Container container: containers) 
			sum = sum + container.calcCharge();
			
		return sum;
	}

}
