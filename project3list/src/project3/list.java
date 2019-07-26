
package project3;

public class list {
	  protected node head;              // ������� ��� ����� ��������
	  protected int length;                // ������� ��������� ��� �����

	  public list()  {  head = null;  length = 0; }    // �� default ����� ����

	  public boolean isEmpty()    { return head == null; }

	  public node insert(Item a) {      // ������ ��� ��� ���������� ��� Item
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
	             if (a.equals(tmp.getValue()))    // ��� ���������� � equals ��� Item
		            return tmp;                           // ���� ������������� �� ������ �
	         return null;                                   //  equals ��� ���������� ���������
	  	}
		public node delete (Item a) {
		    node n1 = head, n2 = head;

		    while ((n1 != null) && (!a.equals( n1.getValue() ) ) ) {  
		        // �������� ��� ����� ��� ����� �� ����������� ��� ��� ����������� ���
		        n2 = n1; n1 = n1.getNext(); }
		    if (n1 != null) {     // ������� � ������ ��� ��������. �� ����������� ��� n1
		        length--;
		        if (n2 != n1)       // n1 != head
		            n2.setNext(n1.getNext());
		        else                  // ����������� �� ����� ��������. ������� �� head
		            head = head.getNext();     
		        n1.setNext(null);
		    }
		    return head;
		  }
		public Item removeFirst() {
		    node tmp = head; // �� ������������� �� head, ��� ������� ��� tmp 
		                                 //  ��� ����� �����
		    if (head != null) {   // ������� ����� ��������;;;
		      length--;
		      head = head.getNext(); // ���������� ��� ������� ��������
		      tmp.setNext(null);          // ������� ���� ����������� ������
		      return tmp.getValue();
		    }
		    else
		      return null;
		}

}
