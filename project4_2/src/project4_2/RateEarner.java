package project4_2;

public class RateEarner extends Earner {
	
	private float pososto;
	
	public RateEarner(String name, int sales, float income,float posostso, float monSalary) {
		super(name, sales, income, monSalary);
		// TODO Auto-generated constructor stub
		this.pososto=pososto;
	}

	
	
	

	public void setPososto(float pososto) {
		this.pososto = pososto;
	}



	float add1=0;
	float add2=0;
	float add3=0;
	
	public void sal(boolean End,int sales1,float income1){
		
		sales=sales+sales1;
		income=income1+income;
		
		if(End==true){
			add1=pososto*sales*10000;
			if(income>5000){
				add2=(float) (income*0.02);
			}
			monSalary=add1+add2;
		}
		
	}
	
	public void getInfo(){
		System.out.println("Ονοματεπώνυμο: "+name);
		System.out.println("Πώληση Μηχανημάτων: "+sales);
		System.out.println("Είσπραξη οφειλωμένων: "+income);
		System.out.println("Ποσοστο: "+pososto);
		System.out.println("Μηνιαιος Μισθος: "+monSalary+" Ευρώ");
	}



		public void initialize1(){
			income=0;
			pososto=0;
		}
	
	
	
}
