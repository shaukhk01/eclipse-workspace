package AdtPractice;

public class MergeRecursiveExample {


	public static void merge(int[]a,int low,int mid,int high) {
		
		int left,right;
		left  = low;
		right = mid+1;
		int k = low;
		
		int[] msort = new int[10];
		
		while(left<=mid && right<=high) {
			
			if(a[left] < a[right]) {
				
				msort[k++] = a[left++];
			}
			else
				msort[k++] = a[right++];
		}
		
		for(;left<=mid;left++)
			msort[k++] = a[left];
		
		for(;right<=high;right++)
			msort[k++] = a[right];
		
		
		for(left=low;left<=high;left++)
			a[left] = msort[left];
	}
	public static void mergeSort(int[]a,int low,int high) {
		
		int mid;
		if(low < high) {
			
			mid = (low+high)/2;
			
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			
			merge(a,low,mid,high);
			
		}
	}
	public static void main(String[] args) {
		
	//	int[] msort = {8,3,7,4,9,2,6,5};//make sure array size also define in merge()
		
        int[] msort = {11,13,7,12,16,9,24,5,10,3};
		mergeSort(msort,0,msort.length-1);
		
		for(int i=0;i<msort.length;i++)
			System.out.print(msort[i]+",");

	}

}
