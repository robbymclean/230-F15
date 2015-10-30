package submission;

import java.util.EmptyStackException;

import adt.Stack;

public class LinkedStack<T> implements Stack<T> {
	private Node top;
	
	public LinkedStack(){
		top = null;
	}
	
	@Override
	public void push(T newEntry) {
		Node newNode = new Node(newEntry, top);
		top = newNode;
		
	}

	
	@Override
	public boolean isEmpty() {
		return top == null;
		
	}


	@Override
	public T peek() {
		if(isEmpty())
			throw new EmptyStackException();
		else
			return top.data;
	
	}

	@Override
	public T pop() {
		if(top != null){
		  T head = top.data;
		  top = top.next;
			return head;
		}
		else
			throw new EmptyStackException();
	}
	@Override
	public void clear() {
		top = null;
		
	}
	
	public String toString() {
		String s = "";
		for (Node n = top; n != null; n = n.next)
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
   public static void main(String[]args){
	   Stack<String> stack = new LinkedStack<>();
	   stack.push("All");
	   stack.push("I");
	   stack.push("Want");
	   stack.push("is");
	   stack.push("you");
	   stack.pop();
	   
	  
	   
   }
}
