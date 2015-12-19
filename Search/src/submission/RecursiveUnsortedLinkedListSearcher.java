package submission;

public class RecursiveUnsortedLinkedListSearcher {
	 static boolean found;
	public static boolean search(Node a, int key) {
		// Returns true if the key is found or
		
		if(a.num() == key){
			found = true;
		}
		else if(a.getNext()!= null){
			search(a.getNext(), key);
		}
		else{
			found = false;
		}
		return found;
	}
}
