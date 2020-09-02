package AdtPractice;

public class MergeIterative {

	public static void msort(int[]a,int l,int mid,int h) {
		
		int i=l;
		int j=mid+1;
		int k=i;
		
		int[]m = new int[8];
		
		while(i<=mid && j<=h) {
			
			if(a[i] < a[j])
				m[k++] = a[i++];
			else
				m[k++] = a[j++];
		}
		
		for(;i<=mid;i++)
			m[k++] = a[i];
		
		for(;j<=h;j++)
			m[k++] = a[j];
		
		for(i=l;i<=h;i++)
			a[i] = m[i];
	}
	
	public static void sort(int[]a,int N) {
		
		int pass,low,high,mid;
		
		for(pass=2;pass<=N;pass=pass*2) {
			
			
			for(int i=0;i+pass-1<=N;i=i+pass) {
				
				low = i;
				high = i+pass-1;
				mid  = (low+high)/2;
				
				msort(a,low,mid,high);
			}
		}
		if(pass/2<N)//if index are not even number like 4,8,
			msort(a,0,pass/2-1,N);
		
	}
	public static void main(String[] args) {

		
		int[] m = {8,3,7,4,3,2,6,5};
		
	//int[] m = {10,7,8,9,1,5};
		sort(m,m.length-1);
		
		for(int i=0;i<m.length;i++)
			System.out.print(m[i]+",");
	}

}
