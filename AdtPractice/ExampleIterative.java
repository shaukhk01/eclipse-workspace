package AdtPractice;

public class ExampleIterative {

	public static void merge(int[]msort,int l,int mid,int h) {
		
		int i = l;
		int j = mid+1;
		int k = l;
		
		int[] sort = new int[10];
		
		while(i<=mid && j<=h) {
			
			if(msort[i] < msort[j]) {
				
				sort[k++] = msort[i++];
			}
			else
				sort[k++] = msort[j++];
				
		}
		
		for(;i<=mid;i++)
			sort[k++] = msort[i];
		
		for(;j<=h;j++)
			sort[k++] = msort[j];
		
		for(i=l;i<=h;i++)
			msort[i] = sort[i];
	}
	
	public static void mergeAlgo(int[]m,int n) {
		
		int p,i,l,h,mid;
		for(p=2;p<=n;p=p*2) {
			
			for(i=0;i+p-1<=n;i=i+p) {
				l = i;
				h = i+p-1;
				mid = (l+h)/2;
				
				merge(m,l,mid,h);
				
			}
		}
		
		if(p/2<n)
			merge(m,0,p/2-1,n);
	}
	public static void main(String[] args) {
		
		int[] m = {9,4,6,3,7,1,2,11,5};
		
		mergeAlgo(m,m.length-1);
		
		for(int i=0;i<m.length;i++)
			System.out.print(m[i]+",");

	}

}
