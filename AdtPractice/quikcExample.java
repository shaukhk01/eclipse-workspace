package AdtPractice;

public class quikcExample {
	
	public static int partition(int[]q,int l,int h) {
		
		int pivot = q[h];
		int i = (l-1);
		int temp;
		for(int j=l;j<h;j++) {
			
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
	public static void sort(int[]q,int low,int high) {
		
		if(low < high) {
		int pi = partition(q,low,high);
		
		sort(q,low,pi-1);
		sort(q,pi+1,high);
		}
		
		}
	public static void main(String[]args) {
		
		//int[] q = {10,7,8,9,1,5};
		int q[] = {9,4,6,3,7,1,2,11};
		sort(q,0,q.length-1);
		for(int i=0;i<q.length;i++)
			System.out.print(q[i]+",");
	}

}
