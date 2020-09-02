package AdtPractice;

public class quickExample {

	public static int partition(int[]q,int l,int h) {
		
		int pivot = q[h];
		int i = (l-1);
		int temp;
		
		for(int j=l;j<=h;j++) {
			
			if(q[j] < pivot) {
				i++;
				
				temp = q[i];
				q[i] = q[j];
				q[j] = temp;
			}
		}
		temp = q[i+1];
		q[i+1] = q[h];
		q[h] = temp;
		
		return i+1;
	}
	public static void quick(int[]q,int l,int h) {
		
		if(l<h) {
			
			int pi = partition(q,l,h);
			quick(q,l,pi-1);
			quick(q,pi+1,h);
		}
	}
	public static void main(String[] args) {

	   // int[] q = {11,13,7,12,16,9,24,5,10,3};
		int[] q = {10,7,8,9,1,5};
	    
	    quick(q,0,q.length-1);
	    
	    for(int i=0;i<q.length;i++)
	    	System.out.print(q[i]+",");
	}

}
