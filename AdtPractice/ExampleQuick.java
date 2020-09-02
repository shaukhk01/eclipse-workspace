package AdtPractice;

public class ExampleQuick {

	public static int merge(int[]a,int low,int high) {
		
		int pivot = a[low];
		int left = low;
		int right = high;
		
		while(left < right) {
			
			while(a[left]<=pivot) {
				left++;
			}
			
			while(a[right]>pivot) {
				right--;
			}
			
			if(left < right)
				swap(a,left,right);
		}
		
		a[low] = a[right];
		a[right] = pivot;
		return right;
		
	}
	
	private static void swap(int[]a,int left,int right) {
		
		int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
	}
	public static void quickSort(int[]a,int low,int high) {
		int pivot;
		if(low < high) {
			
			pivot = merge(a,low,high);
			
			quickSort(a,low,pivot-1);
			quickSort(a,pivot+1,high);
			
		}
	}
	public static void main(String[] args) {
//		int[] m = {10,7,8,9,1,5,65535};
		int[] m  = { 8,3,7,4,9,2,6,5,6555};

		quickSort(m,0,m.length-1);
		
		
		for(int i=0;i<m.length;i++) {
			System.out.print(m[i]+",");
		}
	}

}
