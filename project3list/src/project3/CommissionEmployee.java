package project3;

public class CommissionEmployee extends ergazomenos {
	public CommissionEmployee(String onoma, String epwnumo, int afm,
			String dieu8unsh,int ariPolhsewn,int mege8osProPlh)
	{
		super(onoma, epwnumo, afm, dieu8unsh);
		// TODO Auto-generated constructor stub
		this.ariPolhsewn=ariPolhsewn;
		this.mege8osProPlh=mege8osProPlh;
	}
	
	public CommissionEmployee(){
		
	}
	public int getAriPolhsewn() {
		return ariPolhsewn;
	}
	public void setAriPolhsewn(int ariPolhsewn) {
		this.ariPolhsewn = ariPolhsewn;
	}
	public int getMege8osProPlh() {
		return mege8osProPlh;
	}
	public void setMege8osProPlh(int mege8osProPlh) {
		this.mege8osProPlh = mege8osProPlh;
	}
	private int ariPolhsewn;
	private int mege8osProPlh;
	
	public void print(){
		super.print();
		System.out.println("αριθμοσ πωλησεων "+ariPolhsewn);
		System.out.println("πληρωμη "+mege8osProPlh);
	}
    
}
