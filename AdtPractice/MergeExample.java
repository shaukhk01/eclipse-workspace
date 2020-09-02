package AdtPractice;

public class MergeExample {
	
	public static void merge(int[]msort,int l,int mid,int h) {
		
		int low = l;
		int high = mid+1;
		int k = low;
		
		int[] sort = new int[10];
		
		while(low<=mid && high<=h) {
			
			if(msort[low] < msort[high])
			sort[k++] = msort[low++];
			else
				sort[k++] = msort[high++];
		}
		
		for(;low<=mid;low++)
			sort[k++] = msort[low];
		for(;high<=h;high++)
			sort[k++] = msort[high];
		
		for(low=l;low<=h;low++)
			msort[low] = sort[low];
	}
	public static void mergeAlgo(int[]m,int n) {
		
		int low,high,mid,p;
		for(p=2;p<=n;p=p*2) {
			
			for(int i=0;i+p-1<=n;i=i+p) {
				
				low = i;
				high = i+p-1;
				mid = (low+high)/2;
				
				merge(m,low,mid,high);
			}
		}
		if(p/2<n)//when list is odd number like 7,9,11,not power o 2 form
			merge(m,0,p/2-1,n);
			
			
	}
	public static void main(String[]args) {
		
	   int[] q = {11,13,7,12,16,9,24,5,10,3};

	//int[] q = {10,7,8,9,1,5};
	   
	   mergeAlgo(q,q.length-1);
	   
	   for(int i=0;i<q.length;i++)
		   System.out.print(q[i]+",");
	}

}
