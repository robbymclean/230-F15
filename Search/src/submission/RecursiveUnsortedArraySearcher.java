package submission;

public class RecursiveUnsortedArraySearcher {
	
	public static int search(int[] a, int key) {
		return search(a, key, a.length-1); // Don't touch
	}
	
	// TODO: Implement this one
	private static int search(int[] a, int key, int endIndex) {
		// Returns the index of the key or
		// -1 if not found
		boolean found = false;
		int i = 0;
		while(!found &&( i < a.length))
			{
				if(a.equals(a[i]))
				 found = true;
				return a[i];
			}
		return -1;
	}
}
