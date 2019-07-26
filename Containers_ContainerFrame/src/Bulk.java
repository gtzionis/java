
public class Bulk extends Container {
	
	private double weight;

	public Bulk(String code, String destination, double weight) {
		super(code, destination);
		this.weight = weight;
	}
	
	public double calcCharge() {
		double result =  10 * weight;
		
		return result;
	}
	
	

}
