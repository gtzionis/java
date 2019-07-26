package project4_2;

public abstract class Earner {
	
	protected String name;
	protected int sales;
	protected float income=0;
	protected float monSalary=0;
	
	public Earner(String name, int sales, float income, float monSalary) {
		this.name = name;
		this.sales = sales;
		this.income = income;
		this.monSalary = monSalary;
	}
	
	 public abstract void getInfo();
	 
	 public abstract void initialize1();
	
	
}
