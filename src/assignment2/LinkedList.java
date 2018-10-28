package assignment2;

public class LinkedList {
	   
    private ListElement head;
    private ListElement tail;
    private int count=0;
    private int data;


public void addElement(ListElement le)
{
        ListElement tempPtr;
            tempPtr = new ListElement(null, le.getData());
     
        if (head == null)
        {
            head = tempPtr;
            tail = head;
        }
        else
        {
            tail.setNext(tempPtr);
            tail = tempPtr;
        }
        incrementCounter();
    }

public  void incrementCounter()
{
    count++;
}   

private void decrementCounter()
{
    count--;
}

@SuppressWarnings("null")
public ListElement getElement(int index)
// returns the element at the specified position in this list.
{
   
    ListElement CurrPtr = new ListElement();
    if (head != null)
    {
        CurrPtr = head;
        for (int i = 0; i < index; i++)
        {
            if (CurrPtr.getNext() == null)
                {return null;}
            CurrPtr = CurrPtr.getNext();
        }
        return CurrPtr;
    }
    return null;
}
    // removes the element at the specified position in this list.
    public ListElement deleteElement(int index)
    {
        ListElement NumPtr = head;
        ListElement TemPtr = null;

        if (!(head == null && tail == null))
        {// Delete first  node
            if (index == 0)
            {
                NumPtr = NumPtr.getNext();
                NumPtr.setNext(NumPtr.getNext());
                head = NumPtr;
            }
            else
            {
            
                for (int i = 1; i < index; i++)
                    NumPtr = NumPtr.getNext();
              
                // Delete node at location->next
                TemPtr = NumPtr.getNext();
                NumPtr.setNext(NumPtr.getNext().getNext());
            }
        }  
        return null;
    }  
   
public void printLinkedListHead()
{
    ListElement currentPtr = new ListElement();
    //ListElement newElement = new ListElement();
    currentPtr=head;
    while(currentPtr != null)
    {
        System.out.println("List Element from head are: " + currentPtr.getData() + "\n");
        currentPtr = currentPtr.getNext();
    }
}

}

