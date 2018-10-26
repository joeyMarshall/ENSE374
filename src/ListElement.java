
public class ListElement
{	
		public ListElement next;
		public ListElement previous;
		private int data;
		
		
		public ListElement()
		{
			this.next = null;
			this.data = 0;
			this.previous = null;
		}
		
		/**
		* @param data
		* an integer to be stored in the node
		* @return
		* None
		**/
		public ListElement(ListElement nextValue, int newData)
		{
			this.data = newData;
			this.next = nextValue;
		}
		
		public void setData(int data)
		{
			this.data = data;
		}

		
		public int getData()
		{
			return this.data;
		}
		
		public void setNext(ListElement nextValue)
		{
			next = nextValue;
		}
		
		
		public ListElement getNext()
		{
			return next;
		}
		
}
