package submission;

public class RecursiveUnsortedLinkedListSearcher {
	public static boolean search(Node a, int key) {
		// Returns true if the key is found or
		// false if not
		boolean found;
		 if(a == null)
			 found = false;
		 else if(key.equals(a.num)){
			 return true;
		 }
            
		 else
			 found = search(a.next , key);
	}
}
