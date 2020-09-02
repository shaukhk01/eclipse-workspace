
public class ExampleHeap {

	private static void maxHeap(int[]a,int N) {
		
		int temp = a[N];
		int j = N;
		
		while(j>0 && temp>a[j/2]) {
			
			a[j] = a[j/2];
			j = j/2;
		}
		
		a[j] = temp;
	}
	public static void main(String[] args) {

		int[] heap = {35,33,42,10,14,19,27,44,26,31};
		for(int i=1;i<heap.length;i++) {
			
			maxHeap(heap,i);
		}
		
		for(int i=0;i<heap.length;i++)
			System.out.print(heap[i]+",");
	}

}
