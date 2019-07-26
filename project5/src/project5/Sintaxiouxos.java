package project5;

public class Sintaxiouxos extends Asfalismenoi {

	public Sintaxiouxos(String name, String aFM, double monthly_amount, double percentage_tax) {
		super(name, aFM, monthly_amount, percentage_tax);
	}
	
	public double CalculateSalary() {
		
		return monthly_amount= monthly_amount*(1-percentage_tax);
		
	}

}
