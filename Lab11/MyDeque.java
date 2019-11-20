// CS 401 Fall 2019
// MyDeque class to implement a simple deque
// Complete the methods indicated.  Be careful about the
// special cases indicated.  See lab for details on how
// to implement the methods.

public class MyDeque implements SimpleDeque
{
	Object [] theData;
	int numItems;

	public MyDeque(int maxItems)
	{
		theData = new Object[maxItems];
		numItems = 0;
	}
	
	public boolean isEmpty()
	{
		return (numItems == 0);
	}
	
	public void addFront(Object X)
	{
		if (theData.length == numItems) {
			//do nothing
		} else {
			Object temp[] = new Object[theData.length];
			for (int c = 0; c < numItems; c++) {
				temp[c] = theData[c];
			}
			
			for (int i = 0; i < numItems; i++) {
				theData[i+1] = temp[i];
			}
			theData[0] = X;
			numItems++;
		}
		// Add new item at front of list (shifting old items
		// to right first).  If the list is full, do not add
		// the item (just do nothing).
	}

	public void addRear(Object X)
	{
		if (theData.length == numItems) {
			//do nothing
		} else {
			theData[numItems] = X;
			numItems++;
		}
		// Add new item at rear of list.  If the list is full,
		// do not add the item (just do nothing).
	}

	public Object removeFront()
	{
		if (numItems == 0) {
			return null;
		}
		
		Object temp = theData[0];
		for (int i = 1; i < numItems; i++) {
			theData[i-1] = theData[i];
		}
		theData[numItems-1] = null;
		numItems--;
		
		return temp;
		// Remove and return front item from list, shifting remaining
		// items to the left to fill the spot.  If list is empty,
		// return null.
	}

	public Object removeRear()
	{
		if (numItems == 0) { //empty list
			return null;
		}
			
		Object temp = theData[numItems-1];
		theData[numItems-1] = null;
		numItems--;
		return temp;
		// Remove and return rear item from list.  If list is empty,
		// return null.
	}
}

