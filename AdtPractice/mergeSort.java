package AdtPractice;

public class mergeSort {

	public static void Merge(int[]m,int l,int mid,int h) {
		int i = l;
		int j = mid+1;
		int k = l;
		
		int[] msort = new int[8];
		
		while(i<=mid && j<=h) {
			if(m[i] < m[j])
			   msort[k++] = m[i++];	
			else
				msort[k++] = m[j++];
		}
		
		for(;i<=mid;i++)
			msort[k++] = m[i];
		for(;j<=h;j++)
			msort[k++] = m[j];
		
		for(i=l;i<=h;i++) {
			m[i] = msort[i];
//			System.out.print(m[i]+" ");
		}
	}
	public static void merge(int[]m,int n) {
		int p,i,l,h,mid;
		for(p=2;p<=n;p=p*2) {
			
			for(i=0;i+p-1<n;i=i+p) {
				
				l = i;
				h = i+p-1;
				mid = (l+h)/2;
				
				Merge(m,l,mid,h);
			}
		}
		/*if(p/2<n)
			Merge(m,0,p/2,n-1);*/
	}
	public static void main(String[] args) {

		int[]merge = {8,3,7,4,9,2,6,5};
		
		merge(merge,merge.length);
		
		for(int i=0;i<merge.length;i++)
			System.out.print(merge[i]+" ");
	}

}
