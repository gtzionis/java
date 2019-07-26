package project3;

import project3.akinhta;

public class akinhtaItem extends Item {
private akinhta m;
	
	public akinhtaItem(akinhta s)
	{
		m=s;
	}
	
	   public Object key() { return m.getDieu8unsh(); }
		
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

		public akinhta getM() {
			return m;
		}

		public void setM(akinhta m) {
			this.m = m;
		}

		


}
