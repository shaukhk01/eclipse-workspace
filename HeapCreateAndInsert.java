
public class HeapCreateAndInsert {

	public static void insertHeap(int[]a,int n) {
		
		int temp,i = n;
		temp = a[i];
		
		while(i>1 && temp > a[i/2]) { 
			
			a[i] = a[i/2];
			i = i/2;
		}
		
		a[i] = temp;
		
	}
			
	public static void main(String[] args) {
		int[] heap = {0,10,20,30,25,5,40,35};
		
		for(int i=2;i<heap.length;i++)
			insertHeap(heap,i);
		
		for(int i=1;i<heap.length;i++)
			System.out.print(heap[i]+" ");

	}

}
