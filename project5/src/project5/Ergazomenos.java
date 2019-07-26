package project5;

public class Ergazomenos extends Asfalismenoi {
	
	private int members;

	public Ergazomenos(String name, String aFM, double monthly_amount, double percentage_tax, int members) {
		super(name, aFM, monthly_amount, percentage_tax);
		this.members=members;
	
	}
	
	public double CalculateSalary() {
		
		return monthly_amount= monthly_amount*(1-percentage_tax)+members*100;
		
	}

}
