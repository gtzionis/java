
package project3;

public class list {
	  protected node head;              // Αναφορά στο πρώτο στοιχείο
	  protected int length;                // Αριθμός στοιχείων στη λίστα

	  public list()  {  head = null;  length = 0; }    // Οι default τιμές τους

	  public boolean isEmpty()    { return head == null; }

	  public node insert(Item a) {      // Ισχύει και για υποκλάσεις της Item
	      length++;
	      head = new node(a, head);
	      return head;
	  }
	  public int getLength() { return length; }
		public void clearList() { head = null; length = 0; }

		public void print() {
			int i=0;
		   for (node tmp = head;      tmp != null;      tmp = tmp.getNext())
		   {
		      System.out.println("No "+i);
			  tmp.print();
		      i++;
		   }
		}
		public node search(Item a) {
		    for (node tmp = head;     tmp != null;      tmp = tmp.getNext())
	             if (a.equals(tmp.getValue()))    // Εδώ χρησιμεύει η equals της Item
		            return tmp;                           // Λόγω πολυμορφισμού θα κληθεί η
	         return null;                                   //  equals της κατάλληλης υποκλάσης
	  	}
		public node delete (Item a) {
		    node n1 = head, n2 = head;

		    while ((n1 != null) && (!a.equals( n1.getValue() ) ) ) {  
		        // ψάχνουμε τον κόμβο τον οποίο θα διαγράψουμε και τον προηγούμενο του
		        n2 = n1; n1 = n1.getNext(); }
		    if (n1 != null) {     // Υπάρχει ο κόμβος που ψάχνουμε. Θα διαγράψουμε τον n1
		        length--;
		        if (n2 != n1)       // n1 != head
		            n2.setNext(n1.getNext());
		        else                  // Διαγράφουμε το πρώτο στοιχείο. Αλλάζει το head
		            head = head.getNext();     
		        n1.setNext(null);
		    }
		    return head;
		  }
		public Item removeFirst() {
		    node tmp = head; // Θα μετακινήσουμε το head, άρα κρατάμε στο tmp 
		                                 //  τον πρώτο κόμβο
		    if (head != null) {   // Υπάρχει πρώτο στοιχείο;;;
		      length--;
		      head = head.getNext(); // Μετακίνηση στο επόμενο στοιχείο
		      tmp.setNext(null);          // Βοηθάει στην αποδέσμευση μνήμης
		      return tmp.getValue();
		    }
		    else
		      return null;
		}

}
