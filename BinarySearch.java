
public class BinarySearch {

	public static boolean binarySearch(int[]search,int low,int high,int keys) {
		
		int mid = 0;
		while(low<=high) {
			mid = (low+high)/2;
			
			if(search[mid] == keys) {
				return true;
			}
			else if(search[mid]>keys) {
				high = mid-1;
			}
			else if(search[mid]<keys) {
				
				low = mid+1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///int[] bs = {2,4,6,10,9,14,16,18,20};
//		int bs [] = {3, 6, 13, 3, 9, 10, 14, 6, 9, 13};
		int low =0;
		int high= bs.length;
		int keys = 10;
		System.out.println(binarySearch(bs,0,high-1,keys));
	}

}
