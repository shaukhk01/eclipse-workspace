/**
 * count sort 
 * @author hector
 *
 */
public class CountSort {

	public static void countSort(int[]c,int n) {
		
		int[] h = new int[25];
		for(int i=0;i<n;i++) {
			
			h[c[i]]++;
		}
		int j=0,k=0;
		for(int i=0;i<h.length;i++) {
			
			if(h[i]>0)
				c[j++] = i;
		}
		
	}
	public static void main(String[] args) {

	  int[] q = {11,13,7,12,16,9,24,5,10,3};
	  
	 countSort(q,q.length); 
	  for(int i=0;i<q.length;i++)
		  System.out.print(q[i]+",");
	}

}
