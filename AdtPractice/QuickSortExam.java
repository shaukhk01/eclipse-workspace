package AdtPractice;

public class QuickSortExam {

	public static int partition(int[]a,int low,int high) {
		
	int left,right,pivot = a[low];	
	left = low;
	right= high;
	
	while(left < right) {
		
		while(a[left]<=pivot) {
			
			left++;
		}
		while(a[right]> pivot)
			right--;
		
		if(left < right) {
			
			swap(a,left,right);
		}
	}
		
		a[low] = a[right];
		a[right] = pivot;
		return right;
	}
	
	private static void swap(int[]a,int left,int right) {
		
		int temp = a[left];
		a[left] = a[right];
		a[right]= temp;
	}
	public static void quickSort(int[]a,int low,int high) {
		
		int pivot;
		if(low < high) {
			
			pivot = partition(a,low,high);
			
			quickSort(a,low,pivot-1);
			quickSort(a,pivot+1,high);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] quick = {8,3,7,4,9,2,6,5,65535};
		int []quick = {11,13,7,2,6,9,4,5,10,3,65535};
		quickSort(quick,0,quick.length-1);
		
		for(int i=0;i<quick.length-1;i++)
			System.out.print(quick[i]+",");
	}

}
