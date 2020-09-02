package AdtPractice;

public class MergeSort {

	private static void merge(int[]a,int low,int mid,int high) {
		
		int i = low;
		int j = mid+1;
		int k = i;
		int[]msort = new int[10];
		while(i<=mid && j<=high) {
			
			if(a[i] < a[j]) {
				
				msort[k++] = a[i++];
			}
			else
				msort[k++] = a[j++];
		}
		
		for(;i<=mid;i++)
			msort[k++] = a[i];
		for(;j<=high;j++)
			msort[k++] = a[j];
		
		for(i=low;i<=high;i++)
			a[i] = msort[i];
	}
	public static void sort(int[]a,int n) {
		int p,low,high,mid;
		for(p=2;p<=n;p=p*2) {
			
			for(int i=0;i+p-1<=n;i=i+p) {
				
				low = i;
				high = i+p-1;
				mid = (low+high)/2;
				
				merge(a,low,mid,high);
			}
		}
		
		if(p/2<n) {
			merge(a,0,p/2-1,n);
		}
	}
	public static void main(String[] args) {

		int[] q = {9,4,6,3,7,1,2,11,5,65535};
		
		//   int[] q = {11,13,7,12,16,9,24,5,10,3,65535};

		sort(q,q.length-1);
		
		for(int i=0;i<q.length-1;i++)
			System.out.print(q[i]+",");
	}

}
