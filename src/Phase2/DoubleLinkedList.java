package Phase2;
import assignment2.*;

public class DoubleLinkedList {
		
		
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
	ListElement le = new ListElement();
	LinkedList list = new LinkedList();
	System.out.format("List added\n");


	//access the members of the class using the object le
	le.setData(0);
	list.addElement(le);
	le.setData(1);
	list.addElement(le);
	le.setData(2);
	list.addElement(le);
	le.setData(3);
	list.addElement(le);
	le.setData(4);
	list.addElement(le);

	ListElement value = new ListElement();
	value=list.getElement(3);
	System.out.format("The value is: " + value.getData() + "\n");

	list.printLinkedListHead();

	list.deleteElement(3);
	list.printLinkedListHead();

	System.out.format("The value is set to 5\n");
	System.out.println(le.getData());
		}
	}




