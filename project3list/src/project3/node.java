
package project3;

public class node extends list {
	  private Item info;
	  private node next;

	  public node(Item dat) { info = dat; }     // �� ���� ���� �� next;;;
	  public node(Item dat, node b) {
	    info = dat;  next = b;
	  }
		public void print(){
			info.print();
		}

	  public Item     getValue()          { return info;  }   // �� ������ �����
	  public void     setNext(node a)  { next = a;     }
	  public node    getNext()            { return next; }
	  
	  public node search(ergazomenos a) {
		    for (node tmp = head;     tmp != null;      tmp = tmp.getNext())
	             if (a.equals(tmp.getValue()))    // ��� ���������� � equals ��� Item
		            return tmp;                           // ���� ������������� �� ������ �
	         return null;                                   //  equals ��� ���������� ���������
	  	}
	  
	  public node search(akinhta a) {
		    for (node tmp = head;     tmp != null;      tmp = tmp.getNext())
	             if (a.equals(tmp.getValue()))    // ��� ���������� � equals ��� Item
		            return tmp;                           // ���� ������������� �� ������ �
	         return null;                                   //  equals ��� ���������� ���������
	  	}
	  
	 
}
