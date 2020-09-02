
/*
 * quicksort algorithm 
 * pivot = high-1
 * quick[j]<=pivot then i++ and swap(q[i],q[j]);
 */
public class QuickSortExample {

	public static void quicksort(int[]quick,int high) {
		
		int pivot = quick[high-1];
		int low = -1;
		int temp;
		for(int h=0;h<high;h++) {
			
			if(quick[h]<=pivot) {
				low++;
				temp = quick[low];
				quick[low] = quick[h];
				quick[h] = temp;
			}
		}
		
		temp =quick[high-1];
		quick[high-1] = quick[low+1]; 
		quick[low+1] = temp;
		
		
		for(int i=0;i<high;i++)
			System.out.print(quick[i]+" ");
	}
	public static void main(String[] args) {
		
		//int[] quick = {10,80,30,90,40,50,70};
		int[] quick = {9,4,6,3,7,1,2,11,5};
		quicksort(quick,quick.length);

	}

}
