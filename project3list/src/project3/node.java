
package project3;

public class node extends list {
	  private Item info;
	  private node next;

	  public node(Item dat) { info = dat; }     // Τι τιμή έχει το next;;;
	  public node(Item dat, node b) {
	    info = dat;  next = b;
	  }
		public void print(){
			info.print();
		}

	  public Item     getValue()          { return info;  }   // Θα κληθεί συχνά
	  public void     setNext(node a)  { next = a;     }
	  public node    getNext()            { return next; }
	  
	  public node search(ergazomenos a) {
		    for (node tmp = head;     tmp != null;      tmp = tmp.getNext())
	             if (a.equals(tmp.getValue()))    // Εδώ χρησιμεύει η equals της Item
		            return tmp;                           // Λόγω πολυμορφισμού θα κληθεί η
	         return null;                                   //  equals της κατάλληλης υποκλάσης
	  	}
	  
	  public node search(akinhta a) {
		    for (node tmp = head;     tmp != null;      tmp = tmp.getNext())
	             if (a.equals(tmp.getValue()))    // Εδώ χρησιμεύει η equals της Item
		            return tmp;                           // Λόγω πολυμορφισμού θα κληθεί η
	         return null;                                   //  equals της κατάλληλης υποκλάσης
	  	}
	  
	 
}
