
public class RecursiveMergeSort {

	public static void merge(int[]m,int l,int mid,int h) {
		int i = l;
		int j = mid+1;
		int k = l;
		int[] rec = new int[10];
		while(i<=mid && j<=h) {
			if(m[i] < m[j]) {
				rec[k++] = m[i++];
			}
			else
				rec[k++] = m[j++];
		}
		for(;i<=mid;i++)
			rec[k++] = m[i];
		for(;j<=h;j++)
			rec[k++] = m[j];
		
		for(i=l;i<=h;i++)
			m[i] = rec[i];
	}
	public static void MergeSort(int[]m,int l,int h) {
		int mid;
		if(l < h) {
			
			mid = (l+h)/2;
			MergeSort(m,l,mid);
			MergeSort(m,mid+1,h);
			merge(m,l,mid,h);
		}
	}
	public static void main(String[] args) {

	  int[] q = {11,13,7,12,16,9,24,5,10,3};
	  MergeSort(q,0,q.length-1);
	  for(int i=0;i<q.length;i++)
		  System.out.print(q[i]+",");
		
	}

}
