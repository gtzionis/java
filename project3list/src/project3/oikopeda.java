package project3;

public class oikopeda extends akinhta {
	

	private int suntelesthsDomhshs;
	
	

	public oikopeda(String dieu8unsh, int tetragwnika,int suntelesthsDomhshs) {
		super(dieu8unsh, tetragwnika);
		this.suntelesthsDomhshs=suntelesthsDomhshs;
		// TODO Auto-generated constructor stub
	}
	public oikopeda(){
		
	}
	

	public int getSuntelesthsDomhshs() {
		return suntelesthsDomhshs;
	}

	public void setSuntelesthsDomhshs(int suntelesthsDomhshs) {
		this.suntelesthsDomhshs = suntelesthsDomhshs;
	}
	
	public void print(){
		super.print();
		System.out.println("συντελεστης δομησης "+suntelesthsDomhshs);
	}
	
}
