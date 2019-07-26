package project3;

public class enoikiazomenaKth extends akinhta {
	public enoikiazomenaKth(String dieu8unsh, int tetragwnika,int lh3hSumb,int plhrwmh) {
		super(dieu8unsh, tetragwnika);
		// TODO Auto-generated constructor stub
		this.lh3hSumb=lh3hSumb;
		this.plhrwmh=plhrwmh;
	}
	
  public enoikiazomenaKth(){
	  
  }
	
	public int getPlhrwmh() {
		return plhrwmh;
	}
	public void setPlhrwmh(int plhrwmh) {
		this.plhrwmh = plhrwmh;
	}
	public int getLh3hSumb() {
		return lh3hSumb;
	}
	public void setLh3hSumb(int lh3hSumb) {
		this.lh3hSumb = lh3hSumb;
	}
	private int plhrwmh;
	private int lh3hSumb;
	
	public void print(){
		super.print();
		System.out.println("ληξη συμβολαιου "+lh3hSumb);
		System.out.println("ενοικιο "+plhrwmh);
	}

}
