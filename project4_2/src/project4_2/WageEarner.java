package project4_2;

public class WageEarner extends Earner {
	
	private float basikos=0;
	private int seminaria=0;
	
	public WageEarner(String name, int sales, float income,float basikos,int seminaria, float monSalary) {
		super(name, sales, income, monSalary);
		// TODO Auto-generated constructor stub
		this.basikos=basikos;
		this.seminaria=seminaria;
	}
	
	public void initialize(){
		sales=0;
		income=0;
		seminaria=0;
	}
	
	boolean sal=false;
	float add1=0;
	float add2=0;
	float add3=0;
	
	public void sal(boolean End,int sales1,float income1,int seminaria1){
		
		sales=sales+sales1;
		income=income1+income;
		seminaria=seminaria1+seminaria;
		
		if(sales>=3 && sal==false ){
			add1=(float) (basikos*0.10);
			sal=true;
		}
		
		if(income1>5000){
			add2=(float) (basikos*0.10)+add2;
		}
		
		if(seminaria1>0){
			add3=(float) (basikos*0.05)+add3;
		}
		
		if(End==true){
			monSalary=basikos+add1+add2+add3;
		}
		
	}
	
	public void getInfo(){
		System.out.println("Ονοματεπώνυμο: "+name);
		System.out.println("Πώληση Μηχανημάτων: "+sales);
		System.out.println("Είσπραξη οφειλωμένων: "+income);
		System.out.println("Βασικός Μισθός: "+basikos);
		System.out.println("Σεμινάρια: "+seminaria);
		System.out.println("Μηνιαιος Μισθος: "+monSalary+" Ευρώ");
	}
	
	public void initialize1(){
		sales=0;
		income=0;
		seminaria=0;
	}

}
