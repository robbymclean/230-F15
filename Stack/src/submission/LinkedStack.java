package submission;

import java.util.EmptyStackException;

import adt.Stack;

public class LinkedStack<T> implements Stack<T> {
	private Node topNode;
	
	public LinkedStack(){
		topNode = null;
	}
	
	@Override
	public void push(T newEntry) {
		Node newNode = new Node(newEntry, topNode);
		topNode = newNode;
		
	}

	
	@Override
	public boolean isEmpty() {
		return topNode == null;
		
	}


	@Override
	public T peek() {
		if(isEmpty())
			throw new EmptyStackException();
		else
			return topNode.data;
	
	}

	@Override
	public T pop() {
		if(topNode != null){
		  T top = topNode.data;
		  topNode = topNode.next;
			return top;
		}
		else
			throw new EmptyStackException();
	}
	@Override
	public void clear() {
		topNode = null;
		
	}
	
	public String toString() {
		String s = "";
		for (Node n = topNode; n != null; n = n.next)
			s += "| " + n.data + " |\n";
		s+= "+++++\n";
		return s;
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

}
