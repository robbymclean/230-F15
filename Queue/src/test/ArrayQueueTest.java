package test;

import static org.junit.Assert.*;
import org.junit.Test;
import adt.Queue;
import submission.ArrayQueue;

public class ArrayQueueTest {
	private Queue<String> queue = new ArrayQueue<String>();
	private static int MAX_CAPACITY = 100;

	@Test
	public void testClear() {
		queue.enqueue("A");
		queue.clear();
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testenqueue() {
		queue.clear();
		queue.enqueue("A");
		String s = "| A |\n+++++\n";
		assertTrue(queue.toString().equals(s));
	}
	
	@Test
	public void testEnqueue2() {
		queue.clear();
		queue.enqueue("A");
		queue.enqueue("C");
		String s = "| C |\n| A |\n+++++\n";
		assertTrue(queue.toString().equals(s));
	}
	
	@Test
	public void testDequeue() {
		queue.clear();
		queue.enqueue("A");
		queue.enqueue("C");
		queue.dequeue();
		String s = "| A |\n+++++\n";
		assertTrue(queue.toString().equals(s));
	}
	
	@Test
	public void testDequeueEmpty() {
		queue.clear();
		queue.dequeue();
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testPeek() {
		queue.clear();
		queue.enqueue("A");
		queue.enqueue("C");
		queue.peek();
		queue.peek();
		String s = "| C |\n| A |\n+++++\n";
		assertTrue(queue.toString().equals(s));
	}
	
	@Test
	public void testEnqueueMany() {
		// Should exceed initial capacity
		queue.clear();
		String s = "";
		for (int i = 0; i < MAX_CAPACITY; i++) {
			queue.enqueue("X");
			s += "| X |\n";
		}
		s += "+++++\n";
		assertTrue(queue.toString().equals(s));
	}

}
