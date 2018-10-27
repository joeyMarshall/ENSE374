package assignment2;

public class LinkedList
{
	private ListElement head;
	private ListElement tail;
	private int count = 0;
	private int data;
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
ListElement le = new ListElement();
LinkedList list = new LinkedList();
System.out.format("The value is:, args");


//access the members of the class using the object le
le.setData(0);
mylist.addElement(le);
le.setData(1);
mylist.addElement(le);
le.setData(2);
mylist.addElement(le);
le.setData(3);
mylist.addElement(le);
le.setData(4);
mylist.addElement(le);

ListElement value = new ListElement();
value=mylist.getElement(3);
System.out.format("The value is: " + value.getData() + "\n");

mylist.printLinkedListHead();

mylist.deleteElement(3);
mylist.printLinkedListHead();

System.out.format("The value is set to 5\n");
System.out.println(le.getData());
	}
}
