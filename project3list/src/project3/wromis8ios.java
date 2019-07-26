package project3;

public class wromis8ios extends ergazomenos {
      public wromis8ios(String onoma, String epwnumo, int afm, String dieu8unsh,int timhAnaWra) {
		super(onoma, epwnumo, afm, dieu8unsh);
		// TODO Auto-generated constructor stub
		this.timhAnaWra=timhAnaWra;
	}
      public wromis8ios(){
    	  
      }

	public int getTimhAnaWra() {
		return timhAnaWra;
	}

	public void setTimhAnaWra(int timhAnaWra) {
		this.timhAnaWra = timhAnaWra;
	}

	private int timhAnaWra;
	
	public void print()
	{
		super.print();
		System.out.println("ποσο πληρωμης ανα ωρα εργασιας "+timhAnaWra);
	}
      
}
