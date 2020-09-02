
/*
 * MergeSort iterative ways
 */
public class MergeSortIterativeVersion {

	    public static void merge(int[]a,int l,int mid,int h) {
	        int i=l;
	        int j = mid+1;
	        int k=l;

	        int[] b = new int[10];

	        while(i<=mid && j<=h) {

	            if(a[i]<a[j])
	                b[k++] = a[i++];
	            else
	                b[k++] = a[j++];
	        }

	        for(;i<=mid;i++)
	            b[k++] = a[i];
	        for(;j<=h;j++)
	            b[k++] = a[j];

	        for(i=l;i<=h;i++)
	            a[i] = b[i];
	    }

	    public static void iterativeMerge(int[]a,int n) {

	        int p,l,h,mid,i;

	        for(p=2;p<=n;p=p*2) {

	            for(i=0;i+p-1<=n;i=i+p) {

	                l = i;
	                h = i+p-1;
	                mid =(l+h)/2;
	                merge(a,l,mid,h);
	            }
	        }

	        if(p/2<n)
	            merge(a,0,p/2-1,n);
	    }


	    public static void main(String[]args) {
	        int[] a = {11,13,7,12,16,9,24,5,10,3};
	        int n = a.length;

	        iterativeMerge(a,n-1);
	        
	        for(int i=0;i<a.length;i++)
	        	System.out.print(a[i]+" ");

	    }

	}