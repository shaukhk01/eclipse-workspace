package AdtPractice;
/*
 * 
 */
public class MergeIterativeSort {

		static int[]mergeSort = new int[10];
	public static void merge(int[]msort,int low,int mid,int high) {
		
		int l = low;
		int j = mid+1;
		int k = l;
		
		
		while(l<=mid && j<=high) {
			
			if(msort[l] < msort[j]) 
				mergeSort[k++] = msort[l++];
			else
				mergeSort[k++] = msort[j++];
				
		}
		
		for(;l<=mid;l++)
			mergeSort[k++] = msort[l];
		for(;j<=high;j++)
			mergeSort[k++] = msort[j];
		
		for(l=low;l<=high;l++)
			msort[l] = mergeSort[l];
			
		
	}
	public static void mergeSort(int[]m,int n) {
		
		int p,i,low,high,mid;
		for(p=2;p<=n;p=p*2) {
			
			for(i=0;i+p-1<=n;i=i+p) {
				
				low = i;
				high = i+p-1;
				mid  = (low+high)/2;
				
				merge(m,low,mid,high);
			}
			
		}
		if(p/2<n)
			merge(m,0,p/2-1,n);
		
	}
	public static void main(String[] args) {
		
	        int[] a = {11,13,7,12,16,9,24,5,10,3};
	        
	        int n = a.length;
	        mergeSort(a,n-1);
	        
	        for(int i=0;i<a.length;i++)
	        	System.out.print(a[i]+" ");
	}

}
