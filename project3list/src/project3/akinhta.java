package project3;

public class akinhta {
	protected String dieu8unsh;
	protected int tetragwnika;
	
	public akinhta(){
		
	}
	
	public akinhta(String dieu8unsh,int tetragwnika){
		this.dieu8unsh=dieu8unsh;
		this.tetragwnika=tetragwnika;
	}

	public String getDieu8unsh() {
		return dieu8unsh;
	}

	public void setDieu8unsh(String dieu8unsh) {
		this.dieu8unsh = dieu8unsh;
	}

	public int getTetragwnika() {
		return tetragwnika;
	}

	public void setTetragwnika(int tetragwnika) {
		this.tetragwnika = tetragwnika;
	}
	
	public void print(){
		System.out.println("διευθυνση "+dieu8unsh);
		System.out.println("τετραγωνικα μετρα "+tetragwnika);
		System.out.println("");
	}
	

}
