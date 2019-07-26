package project2;

public class ergazomenos {
	private String lastname;
	private int kwdikos;
    
	private int kostos;
	
	

	public ergazomenos(String lastname,int kwdikos,int kostos){
		this.lastname=lastname;
		this.kwdikos=kwdikos;
		this.kostos=kostos;
	}
	
	
	public int getKwdikos() {
		return kwdikos;
	}

	public void setKwdikos(int kwdikos) {
		this.kwdikos = kwdikos;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getKostos() {
		return kostos;
	}
	public void setKostos(int kostos) {
		this.kostos = kostos;
	}

	
	
	
	
}
