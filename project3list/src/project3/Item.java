
package project3;

public abstract class Item {
	abstract public boolean equals(Item k);
	abstract public boolean less(Item k);
	abstract public Object key();  // ���������� �� ��������
	abstract public void print();
}
