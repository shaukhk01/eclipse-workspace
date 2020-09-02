package AdtPractice;

public class HeapExample {

	public static void maxHeap(int[]heap,int n) {
		
		int i = n;
		int temp = heap[n];
		
		while(i>1 && temp > heap[i/2]) {
			
			heap[i] = heap[i/2];
			i = i/2;
			
		}
		heap[i] = temp;
	}
	public static void main(String[] args) {
		
		int[] h = {0,10,20,30,25,5,40,35};
		
		//because of we assume index start from one onwards so keep index[0] = 0
		for(int i=2;i<h.length;i++) {
			
			maxHeap(h,i);
		}
		
		for(int i=1;i<h.length;i++)
			System.out.print(h[i]+",");

	}

}
