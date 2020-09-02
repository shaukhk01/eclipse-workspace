package AdtPractice;

public class ExampleMergeSort {
	
	public static void merge(int[]m,int l,int mid,int h) {
	
		int low = l;
		int high = mid+1;
		int k =low; 
		int[] msort = new int[10];
		
		while(low<=mid && high<=h) {
			
			if(m[low] < m[high]) {
				
				msort[k++] = m[low++];
			}
			else
				msort[k++] = m[high++];
		}
		for(;low<=mid;low++)
			msort[k++] = m[low];
		
		for(;high<=h;high++)
			msort[k++] = m[high];
		
		
		for(low=l;low<=h;low++)
			m[low] = msort[low];
		
	}
	public static void mergeAlgo(int[]m,int n) {
		
		int p,i,l,h,mid;
		for(p=2;p<=n;p=p*2) {
			
			for(i=0;i+p-1<=n;i=i+p) {//i+p-1<=n ==n because n-1 already ur passing from main
				
				l = i;
				h = i+p-1;
				mid = (l+h)/2;
				
				merge(m,l,mid,h);
			}
		}
		
		if(p/2<n)
			merge(m,0,p/2-1,n);
	}
	public static void main(String[]args) {
		
		//int q[] = {9,4,6,3,7,1,2,11};
		//int[] q = {2,5,8,12,3,6,7,10};
		
		
	    int[] q = {11,13,7,12,16,9,24,5,10,3};
		mergeAlgo(q,q.length-1);
		
		for(int i=0;i<q.length;i++)
			System.out.print(q[i]+",");

	}

}
