package AdtPractice;
//int[] q = {9,4,6,3,7,1,2,11,5};

public class QuickSortExample {

	public static int partition(int[]a,int low,int high) {
		
		int left,right,pivot = a[low];
		left = low;
		right = high;
		while(left < right) {
			
			while(a[left]<=pivot) {
				left++;	
			}
			while(a[right]> pivot) {
				right--;
			}
			
			if(left < right) {
				
				swap(a,left,right);
			}
			
		}
		
		//right is final position for the pivot
		a[low] = a[right];
		a[right] = pivot;
		return right;
	}
	
	public static void swap(int[]s,int left,int right) {
		
		int temp = s[left];
		s[left] = s[right];
		s[right] = temp;
	}
	public static void quickSort(int[]a,int low,int high) {
		
		if(low < high) {
			
			int pivot = partition(a,low,high);
			
			quickSort(a,low,pivot-1);
			quickSort(a,pivot+1,high);
		}
	}
	public static void main(String[] args) {

		int[] q = {9,4,6,3,7,1,2,11,5};
		quickSort(q,0,q.length-1);
		for(int i=0;i<q.length;i++)
			System.out.print(q[i]+",");
	}

}
