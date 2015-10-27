package adt;


public class LinkedBag<T> implements BagInterface<T>{
	private Node head = null;       // Reference to first node
	private int numEntries = 0;
	
	public String toString() {
		String s = "";
		// iterate over all the items in people chain
		Node n = head;
		while (n != null) {
			// do something to s with n's name
			s += n.data + " -> ";
			n = n.next;
		}
		s += "null";
		return s;
	}

	@Override
	public int getCurrentSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(T newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(T anEntry) {
		Node n = head;
		Node prev = null;
		while (n != null) {
			if (n.data.equals(anEntry)) {
				// remove the node
				if (prev == null) // only for the first case
					head = head.next;
				else
					prev.next = n.next; // all other cases
				numEntries--;
				return true;
			}
			prev = n;
			n = n.next;
		}
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T[] toArray() {
		T[] array = (T[]) new Object[numEntries];
		Node n = head;
		int i = 0;
		while (n != null) { // could also be for i < numEntries
			// do something -- copy
			array[i] = n.data;
			i++;
			n = n.next;
		}
		return array;
	}
	
	
	
	private class Node 
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
