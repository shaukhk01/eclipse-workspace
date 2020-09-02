package AdtPractice;

public class InsertionSort {

	public static void insertionSort(int[]s,int n) {
		int j,x;
		for(int i=1;i<n;i++) {
			
			j = i-1;
			x = s[i];
			
			while(j>-1 && s[j]>x) {
				
				s[j+1] = s[j];
				j--;
			}
			s[j+1] = x;
		}
		
		
	}
	public static void main(String[] args) {

		int[] insertion = {11,13,7,2,6,9,4,5,10,3};
		int n = insertion.length;
		
		insertionSort(insertion,n);
		
		for(int i=0;i<n;i++)
			System.out.print(insertion[i]+" ");
	}

}
