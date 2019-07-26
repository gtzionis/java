
package project3;

public class NewSortedList extends sortedList {
	
	public Item getIthElement(int i)
	{
		node tmp=head;
		for(int j=0;j<i;j++)
		{
			if(tmp==null)
				return null;
			tmp=tmp.getNext();
		}
		return tmp.getValue();
	}
	public NewSortedList()
	{
		super();
	}

}
