package AdtPractice;

public class IterativeMergeSort {
	
	public static void merge(int[]m,int l,int mid,int h) {
		
		int low = l;
		int high = mid+1;
		int k = low;
		int[] msort = new int[8];
		
		while(low<=mid && high<=h) {
			
			if(m[low] < m[high])
				msort[k++] = m[low++];
			else
				msort[k++] = m[high++];
		}
		
		for(;low<=mid;low++)
			msort[k++] = m[low];
		
		for(;high<=h;high++)
			msort[k++] = m[high];
		
		for(low=l;low<=h;low++) {
			m[low] = msort[low];
		}
	}
	public static void mergeAlgo(int[]a,int n) {
		
	int low,high,mid;
	
		for(int p=2;p<=n;p=p*2) {
			
			for(int i=0;i+p-1<n;i=i+p) {
				low = i;
				high = i+p-1;
				mid = (low+high)/2;
				
				merge(a,low,mid,high);
				
			}
		}
	}
	public static void main(String[]args) {
		
		int[] sort = {8,2,9,6,5,3,7,4};
		
		mergeAlgo(sort,sort.length);
		
		for(int i=0;i<sort.length;i++)
			System.out.print(sort[i]+" ");
	}

}
