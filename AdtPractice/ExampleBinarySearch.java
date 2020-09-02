package AdtPractice;

public class ExampleBinarySearch {

	private static boolean binarySearch(int[]a,int keys) {
		
		int low = 0;
		int high = a.length;
		
		int mid;
		while(low<=high) {
			
			mid = (low+high)/2;
			
			if(a[mid]==keys)
				return true;
			
			else if(a[mid]>keys)
				
				high = mid-1;
			else if(a[mid]<keys)
				low = mid+1;
		}
		return false;
	}
	public static void main(String[] args) {

		
		int[] b = {2,3,4,6,8,9,12,20,22,36};
		int keys = 36;
		if(binarySearch(b,keys)) {
		System.out.println("True");	
		}
		else
			System.out.println("False");
	}

}
