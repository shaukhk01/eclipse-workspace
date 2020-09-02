package AdtPractice;

public class MaxHeapExample {

	public static void maxHeap(int[]h,int n) {
		
		int temp,i = n;
		temp = h[n];
		
		while(i>1 && temp>h[i/2]) {
			
			h[i] = h[i/2];
			i=i/2;
		}
		h[i] = temp;
	}
	public static void main(String[]args) {
		
	    int[] q = {0,11,13,7,12,16,9,24,5,10,3};
	    
	    for(int i=2;i<q.length;i++)
	    	maxHeap(q,i);
	    
	    for(int i=1;i<q.length;i++)
	    	System.out.print(q[i]+",");
	}
}
