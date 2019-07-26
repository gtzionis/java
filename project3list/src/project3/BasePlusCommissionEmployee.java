package project3;

public class BasePlusCommissionEmployee extends CommissionEmployee {
public BasePlusCommissionEmployee(String onoma, String epwnumo, int afm,
			String dieu8unsh, int ariPolhsewn, int mege8osProPlh,int mis8os) {
		super(onoma, epwnumo, afm, dieu8unsh, ariPolhsewn, mege8osProPlh);
		// TODO Auto-generated constructor stub
		this.mis8os=mis8os;
	}

public BasePlusCommissionEmployee(){
	
}

private int mis8os;

public int getMis8os() {
	return mis8os;
}

public void setMis8os(int mis8os) {
	this.mis8os = mis8os;
}	

public void print(){
	super.print();
	System.out.println("μισθος "+mis8os);
}

}
