package submission;

public class RecursiveInsertionSorter {
	public static int[] sort(int[] unsorted, int n) {
		int i;
		if(n < 1)
			sort(unsorted,n -1);
		else{
			int k = unsorted[n];
			i = n-1;
			while( i>0 && unsorted[i] > k){
				unsorted[i+1] = unsorted[i];
				i = i-1;
			}
			unsorted[i+1] = k;
		}
		return unsorted;
	}
}
