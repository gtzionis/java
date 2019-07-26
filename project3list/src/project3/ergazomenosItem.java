package project3;

import project3.ergazomenos;

public class ergazomenosItem extends Item {
private ergazomenos m;
	
	public ergazomenosItem(ergazomenos s)
	{
		m=s;
	}
	
	   public Object key() { return m.getOnoma(); }
		
	   public boolean equals(Item o) {
	     return key().equals( (String)o.key()); 
	   }

	   public boolean less(Item o) {
		     if ( ((String)key()).compareTo( (String)o.key() ) < 0)    return true;
		     return false;
		   }
		   public String toString() {  
		     return m.toString(); 
		   }
		public void print(){
			m.print();
		}

		public ergazomenos getM() {
			return m;
		}

		public void setM(ergazomenos m) {
			this.m = m;
		}

		

}
