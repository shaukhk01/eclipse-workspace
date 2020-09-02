//daigonal element from two dimensional array.
//make sure multi dimensional array implemented in C language in matrix form
//but in java Arrays of Arrays
public class DaigonalMatrix {

	public static void daigonal(int[][]matrix,int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(i==j)
					System.out.print(matrix[i][j]+" ");
			}
		}
		System.out.println();
		
	}
	public static void main(String[] args) {

		int matrix = 4;
		int[][] mat = {{1,2,3,4},
				       {5,6,7,8},
				       {1,2,3,4},
				       {5,6,7,8}};
		
		
		daigonal(mat,matrix);
		}
	}
