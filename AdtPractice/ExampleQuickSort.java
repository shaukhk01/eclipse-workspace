package AdtPractice;

public class ExampleQuickSort {
	
	public static int partition(int[]q,int l,int h) {
		
		int pivot = q[h];
		int low = (l-1);
		int temp;
		
		for(int j=l;j<h;j++) {//j=l-->whatever l value from onwards start j becase of current l value before all are sorted
			
			if(q[j] < pivot) {
				
				low++;
				temp = q[low];
				q[low] = q[j];
				q[j] = temp;
				
			}
		}
		temp = q[low+1];
		q[low+1] = q[h];
		q[h] = temp;
		
		return low+1;
	}
	public static void sort(int[]s,int l,int h) {
		
		if(l < h) {
			
			int pi = partition(s,l,h);
			
			sort(s,l,pi-1);//provide sorting
			sort(s,pi+1,h);//provide sorting one by one
		}
	}
	public static void main(String[]args) {
		
	//	int q[] = {9,4,6,3,7,1,2,11};
		int[] q = {10,7,8,9,1,5};
		
		sort(q,0,q.length-1);
		
		for(int i=0;i<q.length;i++)
			System.out.print(q[i]+",");
	
	}

}
