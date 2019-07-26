
package project3;

public class sortedList extends list {
	  public node insert (Item a) {                         // ���������� ��� ������
		    node tmp = new node(a);     length++;
		    node n1 = head, n2 = head;

		    // ��� �� ����� ������� � ������� ��������� less
		    while ((n1 != null) && (n1.getValue().less(a) )) {  // ���������� ���� 2 ������� ������
		      n2 = n1;   n1 = n1.getNext();  }                          // ��� ������ �� ����� � ��������
		    if (n1 == head) {                                                  // ��� ������� �������� ���� ����...
		      tmp.setNext(n1); head = tmp;
		    }
		    else {                    // �������� ������ n1 ��� n2. �������� ��� ��� �������� ��� �����
		      n2.setNext(tmp);
		      tmp.setNext(n1);   
		    } 
		    return head;
		  } 


}
