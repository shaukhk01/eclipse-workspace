
public class SortedAarrayAcordingB {

	
	public static int binarySearch(int[]search,int low,int high,int keys) {
		
		int mid = 0;
		while(low<=high) {
			mid = (low+high)/2;
			
			if(search[mid] == keys) {
				search[mid] = -1;
				return keys;
				/*c[k++] = search[mid];
				c[k++] = search[mid];
				i++;*/
			}
			
			else if(search[mid]>keys) {
				high = mid-1;
			}
			else if(search[mid]<keys) {
				
				low = mid+1;
				//high=search.length-1;
			}
			
		}
		return 0;
	}
	
	private static int duplicate(int[]search,int N,int keys) {
		
		for(int i=0;i<N;i++) {
			
			if(search[i] == keys)
				return keys;
		}
		return 0;
	}
	public static void main(String[] args) {

		int search [] = {3, 6, 13, 3, 9, 10, 14, 6, 9, 13};
		int B[] = {6, 3, 9, 13, 10};
		
//		Output: {6, 6, 3, 3, 9, 9, 13, 13, 10, 14}

		int output[] = new int[8];
		int k=0;
		int i=0;
		int high = search.length;
		for(;i<high;i++) {
			
		int x = binarySearch(search,1,high,B[i]);
		System.out.print(x);
		if(x !=0) {
			output[k++] = x;
			//output[k++] = x;
		}
		 x = duplicate(search,search.length,B[i]);
		
			if(x !=0) {System.out.print(","+x+",");
			output[k++] = x;}
		}
		
	}

}