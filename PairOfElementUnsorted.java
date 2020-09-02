/**
 * from unsorted Array Find pair of Element
 * ,And also Using Hashing Method to Find Pair
 * Of Element from Array.
 * @author hector
 *
 */
public class PairOfElementUnsorted {

	public static void pairElement(int[]u,int m) {
		int k = 10;
		for(int i=0;i<m;i++) {
			
			for(int j=i+1;j<m;j++) {
				
				if(u[i] + u[j] == k) {
					System.out.print(u[i]+","+u[j]+" ");
				}
			}
			
		}
	}
	
	public static void hashPairElement(int[]u,int m) {
		
		int[] hash = new int[16+1];
		int k = 10;
		for(int i=0;i<m;i++) {
			
			if(k-u[i]>0 ) {//handling negative index
				
			if(hash[k-u[i]] !=0) {
				
				System.out.print(u[i]+","+(k-u[i])+" ");
			}
			
		}
			hash[u[i]]++;//increase index value.
		}
	}
	public static void main(String[] args) {
		
		int[] unsorted = {6,3,8,10,16,7,5,2,9,14};
//        int[] unsorted = {4,8,3,2,6,5,1,7};
		
		int m = unsorted.length;
		
		pairElement(unsorted,m);

		System.out.println();
		hashPairElement(unsorted,m);
	}

}
