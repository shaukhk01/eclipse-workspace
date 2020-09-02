
/*
 * MergeSort 
 */
public class MergeSort {

	public static void mergeSort(int[]a,int[]b,int n,int m) {
		
		int i=0;
		int j=0;
		int k=0;
		int[] mergeSort = new int[m+n];
		while(i<n && j<m) {
			
			if(a[i] < b[j]) {
				mergeSort[k++] = a[i++];
			}
			else if(a[i] > b[j]) {
				mergeSort[k++] = b[j++];
			}
		}
		
		while(i<n) 
			mergeSort[k++] = a[i++];
		while(j<m)
			mergeSort[k++] = b[j++];
		
		
		for(int x=0;x<mergeSort.length;x++)
			System.out.print(mergeSort[x]+" ");
	}
	public static void main(String[] args) {
		
		int[] A = {2,10,18,20,23};
		int[] B = {4,9,19,25,27,28};

		int n = A.length;
		int m = B.length;
		mergeSort(A,B,n,m);
	}
}
