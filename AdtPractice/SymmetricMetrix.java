
public class SymmetricMetrix {

	public static void transpose(int[][]mat,int[][]tr,int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				tr[i][j] = mat[j][i];
				System.out.print(tr[i][j]+"   ");
		}
			System.out.println();
	}
	}
	
	public static boolean isSymmetric(int[][]sym,int n) {
		
		int[][] tr= new int[3][3];
		transpose(sym,tr,n);
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++)
				if(sym[i][j] !=tr[i][j])
					return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int mat[][] = { { 1, 3, 5 }, 
		                { 13, 2, 4 }, 
		                { 15, 4, 6 } 
		              }; 

		int n = 3;
		
		System.out.println(isSymmetric(mat,n));
	}

}