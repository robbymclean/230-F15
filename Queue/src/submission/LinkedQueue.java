package submission;


import java.util.NoSuchElementException;
import adt.Queue;

public class LinkedQueue<T> implements Queue<T> {
	private Node head, tail;
	
	public LinkedQueue(){
		head = null;
		tail = null;
	}
	
	@Override
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry, null);
		if(isEmpty())
			head = newNode;
		else
			tail.next = newNode;
			tail = newNode;
		
	}

	@Override
	public T dequeue() {
	   T front = null;
	   if(!isEmpty()){
		   front = head.data;
		   head = head.next;
		  if(head == null)
			  tail = null;
	   }
		return front;
	}

	@Override
	public T peek() {
		if(isEmpty())
			throw new NoSuchElementException();
		else
			return head.data;

	}

	@Override
	public boolean isEmpty() {
		return (head == null) && (tail == null);
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
		
	}
	
	public String toString() {
		String s = head.data.toString();
		for (Node i = head.next; i != null; i = i.next)
			s += " -> " + i.data;
		s+= "\n";
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
		} 
		public void setData(T d){
			   data = d;// end constructor
		}
		public void setNextNode(Node n){
			next = n;
		}
	}
	public static void main(String[]args){
		Queue<String> myQueue = new LinkedQueue<>();
		myQueue.enqueue("Rob");
		myQueue.enqueue("Ryan");
		myQueue.enqueue("Ray");
		myQueue.enqueue("Ron");
		myQueue.enqueue("Morgan");
		String name = myQueue.dequeue();
		System.out.println(name);
		System.out.println(myQueue);
	}
}
// end Node

