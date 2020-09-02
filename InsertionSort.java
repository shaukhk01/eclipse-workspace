
public class InsertionSort {

	public static void insertionSort(int[]is,int n,int ele) {
		
		for(int i=n-2;i>=0;i--) {
			
			if(is[i] > ele) {
				
				is[i+1] = is[i];
			}
			else {
				is[i+1] = ele;
			break;
			}
			
		}
		
		for(int i=0;i<n;i++)
			System.out.print(is[i]+" ");
	}
	public static void main(String[] args) {

		int[]insertion = {2,6,10,15,20,25,30,0};
		insertionSort(insertion,insertion.length,12);
	}

}
