
public class ExampleOfMaxHeap {

	public static void maxHeap(int[]a,int n) {
		
		int temp = a[n];
		int i=n;
	while(i>0 && temp > a[i/2]) {
		
		a[i] = a[i/2];
		i = i/2;
	}
	a[i] = temp;
	}
	public static void main(String[] args) {

		int[] h = {10,20,30,25,5,40,35};
		
		for(int i=1;i<7;i++)
		{
			maxHeap(h,i);
		}
		
		for(int i=0;i<h.length;i++)
			System.out.print(h[i]+",");
	}

}
