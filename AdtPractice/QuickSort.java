package AdtPractice;

public class QuickSort {

	private static int partition(int[]a,int low,int high) {
		
		int left,right,pivot = a[low];
		left = low;
		right= high;
		
		while(left < right) {
			
			while(a[left] <=pivot) {
				
				left++;
			}
			
			while(a[right]>pivot) {
				
				right--;
			}
			
			if(left < right) {
				
				swap(a,left,right);
			}
		}
		
		a[low] = a[right];
		a[right] = pivot;
		return right;
	}
	private static void swap(int[]s,int left,int right) {
		
		int temp = s[left];
		s[left]  = s[right];
		s[right] = temp;
		
	}
	public static void quickSort(int[]a,int low,int high) {
		
		int pivot;
		if(low < high) {
			
			pivot = partition(a,low,high);
			
			quickSort(a,0,pivot-1);//for left shifting order
			quickSort(a,pivot+1,high);
		}
	}
	public static void main(String[] args) {

	//	int[] q = {9,4,6,3,7,1,2,11,5,65535};
		
		int[] q = {35,50,15,25,80,20,90,45,65535};
		quickSort(q,0,q.length-1);
		
		for(int i=0;i<q.length-1;i++)
			System.out.print(q[i]+",");
	}

}
