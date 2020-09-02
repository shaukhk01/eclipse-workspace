
public class ExampleInsertionSort {

	public static void insertiontSort(int[]a,int N) {
		
		int temp;
		for(int i=2;i<N;i++) {
			
			temp = a[i];
			
			int j = i-1;
			while(j>-1 && temp < a[j]) {
				
				a[j+1] = a[j];
				j--;
			}
			
			a[j+1] = temp;
		}
	}
	public static void main(String[]args) {
		
		int[] N = {0,8,3,7,4,9,2,6,5};
		int[] m = {3,6,13,3,9,10,14,6,9,13};
	insertiontSort(m,m.length);	
	
	for(int i=1;i<m.length;i++)
		System.out.print(m[i]+",");
	}
}
