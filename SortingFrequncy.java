/*
 * Sorting elements of an array by frequency
 */
public class SortingFrequncy {

	public static void sort(int[]a) {
		
		
		int[] h = new int[13];
		
		for(int i=0;i<a.length;i++) {
			
			h[a[i]]++;
		}
		
		getMax(h);
	}
	private static void getMax(int[]h) {
		
		int max = h[0];
		for(int i=1;i<h.length;i++) {
			
			if(h[i] > max)
				max = h[i];
		}
		
		decreasingSort(h,max);
	}
	
	private static void decreasingSort(int[]h,int x) {
		int max = x;
		int i=0;
		int temp;
		while(max !=0) {
			
			if(h[i] == max) {
				temp = h[i];
				
				while(temp !=0) {
					System.out.print(i+" ");
					temp--;
				}
				
				for(++i; i<h.length;i++){
					
					if(h[i] == max) {
					
					temp = h[i];
					while(temp !=0) {
						System.out.print(i+" ");
						temp--;
					}}
				}
				max--;
				i=0;
			}
			else
				i++;
		}
		
	}
	
		
	public static void main(String[] args) {
		
		int[] f = {2,5,2,8,5,6,8,8};
		//int[] f = {2,3,2,4,5,12,2,3,3,3,12};
		//int[] f = {1,5,5,5,4,6,4};
		sort(f);

	}

}
