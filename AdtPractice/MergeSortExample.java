package AdtPractice;

public class MergeSortExample {

	public static void merge(int[]a,int l,int mid,int h) {
		
		int i = l; 
		int j = mid+1;
		int[] msort = new int[12];
		
		int k = l;
		while(i<=mid && j<=h) {
			
			if(a[i] < a[j]) {
				msort[k++] = a[i++];
			}
			else 
				msort[k++] = a[j++];
		}
		
		for(;i<=mid;i++)
			msort[k++] = a[i];
		
		for(;j<=h;j++)
			msort[k++] = a[j];
		
		for(i=l;i<=h;i++) {
			a[i] = msort[i];
	}
	}
	
	public static void mergeAlgo(int[]a,int n) {
		
		int pass,low,high,mid;
		for(pass=2;pass<=n;pass=pass*2) {
			
			
			for(int i=0;i+pass-1<n;i=i+pass) {
				
				low = i;
				high = i+pass-1;
				mid = (low+high)/2;
				
				merge(a,low,mid,high);
			}
		}
		
		if(pass/2<n)
			merge(a,0,pass/2-1,n);
			
	}
	public static void main(String[] args) {

		int[] m = {8,3,7,4,9,2,11,10,6,5,12};
		
		mergeAlgo(m,m.length-1);
		
		for(int i=0;i<m.length;i++)
			System.out.print(m[i]+",");
	}

}
