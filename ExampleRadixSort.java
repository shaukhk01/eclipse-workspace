
/*
 * radix sort algorithm before you must
 * have idea about count sort
 */
public class ExampleRadixSort {

	public static int getMax(int[]a,int N) {
		int max = a[0];
		for(int i=0;i<=N;i++)
		{
			if(max < a[i])
				max = a[i];
		}
		return max;
	}
	
	public static void sort(int[]a,int N,int max) {
		
		
		for(int pass=1;max/pass>0;pass= pass*2) {
			
			countSort(a,N,pass);
		}
	}
	
	public static void countSort(int[]a,int N,int pass) {
		
		int[] b = new int[11];
		int[] count = new int[11];
		for(int i=N;i>=0;i--) {
			
			++count[(a[i]/pass)%10];
		}
		
		for(int i=1;i<b.length;i++) {
			
			count[i] = count[i]+count[i-1];
		}
		
		for(int i=N;i>=0;i--) {
			
			b[--(count[(a[i]/pass)%10])] = a[i];
		}
		
		
		for(int i=0;i<=N;i++) {
			
			a[i] = b[i];
		}
	}
	public static void main(String[] args) {

		int[] radix = {432,118,530,170,168,231,111,145,677,199,1000};
		
		int max = getMax(radix,radix.length-1);
		 sort(radix,radix.length-1,max);
		 
		 for(int i=0;i<radix.length;i++)
			 System.out.print(radix[i]+",");
	}

}
