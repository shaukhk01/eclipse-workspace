package AdtPractice;

public class ExampleMerge {

	public static void merge(int[]a,int low,int mid,int high) {
		
		int i=low;
		int j = mid+1;
		int k=low;
		
		int[] ms = new int[11];
		while(i<=mid && j<=high) {
			
			if(a[i] < a[j])
				ms[k++] = a[i++];
			else
				ms[k++] = a[j++];
		}
		
		for(;i<=mid;i++)
			ms[k++] = a[i];
		for(;j<=high;j++)
			ms[k++] = a[j];
		
		for(i=low;i<=high;i++)
			a[i] = ms[i];
	}
	public static void mergeSort(int[]a,int n) {
		int p,i,low,high,mid;
		for(p=2;p<=n;p=p*2) {
			
			for(i=0;i+p-1<=n;i=i+p) {
				
				low = i;
				high = i+p-1;
				mid = (low+high)/2;
				
				merge(a,low,mid,high);
				
			}
		}
		if(p/2<n)//because of when N is odd number required this operation also.
			merge(a,0,p/2-1,n);
		
	}
	public static void main(String[] args) {

		int[] sort= {8,3,7,4,9,2,6,5,10,1,11};
		mergeSort(sort,sort.length-1);
		
		for(int i=0;i<sort.length;i++)
			System.out.print(sort[i]+",");
	}

}
