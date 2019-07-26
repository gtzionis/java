package project3;

public class idiokthtaKth extends akinhta {
	public idiokthtaKth(String dieu8unsh, int tetragwnika,int a3ia) {
		super(dieu8unsh, tetragwnika);
		// TODO Auto-generated constructor stub
		this.a3ia=a3ia;
	}
	
	public idiokthtaKth(){
		
	}

	public int getA3ia() {
		return a3ia;
	}

	public void setA3ia(int a3ia) {
		this.a3ia = a3ia;
	}

	private int a3ia;
	
	public void print(){
		super.print();
		System.out.println("במיב "+a3ia);
	}

}
