package submission;
import java.util.NoSuchElementException;
import adt.Queue;

public class ArrayQueue<T> implements Queue<T> {
	private T[] data;
	private int head, tail;
	

	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		
		tail = (tail + 1) % data.length;
		data[tail] = newEntry;
		
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new NoSuchElementException();
		else
		{
			T front = data[head];
			data[head] = null;
			head = (head + 1) % data.length;
			return front;
		}
		
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new NoSuchElementException();
		else
			return data[head];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		return head == ((tail + 1)% data.length);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			for(int i = head; i != tail; i = (i+1)%
			data.length) {
				data[i] = null;
			}
		data[tail] = null;
	}
		head = 0;
		tail = data.length -1;
	}
	
	
	
	public String toString() {
		String s = data[head].toString();
		for (int i =( head+1) % data.length; 
				i <=(tail + data.length)% data.length; 
				i = i + data.length)
			s += " -> " + data[i];
		s+= "\n";
		return s;
	}
 public static void main(String[]args){
	 Queue<String> anotherqueue = new ArrayQueue<>();
	 anotherqueue.enqueue("What");
	 anotherqueue.enqueue("It's Robby");
	 anotherqueue.enqueue("My major is Comp Sci");
	 String name = anotherqueue.dequeue();
	 System.out.println(anotherqueue);
	 anotherqueue.clear();
 }
}
