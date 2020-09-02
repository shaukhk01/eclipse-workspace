package AdtPractice;

public class HeapMaxheapExample {

	public static void maxHeap(int[]a,int n) {
		
		int temp = a[n];
		int j =n;
		while(j>1 && temp > a[j/2]) {
			
			
			a[j] = a[j/2];
			j = j/2;
		}
		
		a[j] = temp;
	}
	
		
	public static void main(String[] args) {

//		int[] heap = {30,20,40,50};
		int[] heap = {0,35,33,42,10,14,19,27,44 ,26 ,31};
		for(int i=2;i<heap.length;i++)
		maxHeap(heap,i);
		
		for(int i=0;i<heap.length;i++)
			System.out.print(heap[i]+",");
	}

}
