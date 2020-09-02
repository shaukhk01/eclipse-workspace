package AdtPractice;

public class QuickExample {

	private static int partition(int[]a,int low,int high) {
		
		int left,right,pivot = a[low];
		left  = low;
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
		
		a[low] = a[right];
		a[right] = pivot;
		return right;
	}
	private static void swap(int[]s,int left,int right) {
		
		int temp =0;
		temp = s[left];
		s[left] = s[right];
		s[right] = temp;
	}
	public static void quick(int[]a,int low,int high) {
		
		if(low < high) {
			
			int pivot = partition(a,low,high);
			
			quick(a,low,pivot-1);
			quick(a,pivot+1,high);
		}
	}
	public static void main(String[] args) {
		
		int[] q = {9,4,6,3,7,1,2,11,5};
		quick(q,0,q.length-1);
		
		for(int i=0;i<q.length;i++)
			System.out.print(q[i]+",");
	}

}
