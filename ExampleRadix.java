
public class ExampleRadix {

	private static void getMax(int[]a,int N) {
	
		int max = a[0];
		for(int i=1;i<=N;i++) {
			
			if(a[i]>max)
				max = a[i];
		}
		
		radixSort(a,max,N);
	}
	
	private static void radixSort(int[]a,int max,int N) {
		
		for(int pass=1;max/pass>=1;pass=pass*10) {
			
			countSort(a,N,pass);
		}
	}
	
	public static void countSort(int[]a,int N,int pass) {
		
		int[] count = new int[12];
		int[] b = new int[12];
		for(int i=N;i>=0;i--) {
			
			count[((a[i]/pass)%10)]++; 
		}
		
		for(int i=1;i<=N;i++) {
			
			count[i] = count[i] + count[i-1];
		}
		
		for(int i=N;i>=0;i--) {
			
				b[--count[(a[i]/pass)%10]] = a[i];
		}
		
		for(int i=0;i<=N;i++)
			a[i] = b[i];
	}
	public static void main(String[] args) {

		int[] radix = {432,118,530,170,168,231,111,145,677,199,1000};
		getMax(radix,radix.length-1);
		
		for(int i=0;i<radix.length;i++)
			System.out.print(radix[i]+",");
		
	}

}
