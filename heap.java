//max heap and simlarly min heap.
public class heap {
	
	public static void insert(int[]a,int n) {
		int temp,i=n;
		temp = a[n];
		while(i>1 && temp> a[i/2]) {
			
			a[i] = a[i/2];
			i = i/2;
		}
		a[i] = temp;
	}
	public static void main(String[]args) {
		
		int[] h = {0,10,20,30,25,5,40,35};
		
		for(int i=2;i<h.length;i++)
			insert(h,i);
		
		for(int i=1;i<h.length;i++)
			System.out.print(h[i]+" ");
	}

}
