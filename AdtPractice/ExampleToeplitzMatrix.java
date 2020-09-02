package AdtPractice;

public class ExampleToeplitzMatrix {

	static int N=4;
	static int M=5;
	public static boolean isDaigonal(int[][]t,int row,int col) {
		
		int result = t[row][col];
			
		while(++row<N && ++col<M) {
			
			if(t[row][col] !=result)
				return false;
		}
		return true;
	}
	
	public static boolean isToeplitz(int[][]t) {
		
		
		for(int i=0;i<M;i++) {
		if(!(isDaigonal(t,0,i))) {
			
			return false;
		}
	}
		
		for(int i=0;i<N;i++) {
			
			if(!(isDaigonal(t,i,0)))
				return false;
		}
		return true;
}
	public static void main(String[] args) {

		int[][] toeplitz = {{6,4,1,8,9},
						    {3,6,4,1,8},
						    {2,3,6,4,1},
						    {0,2,3,6,4,1},
						   };
		
		  int mat[][] = { { 6, 7, 8, 9 }, 
		                  { 4, 6, 7, 8 }, 
		                  { 1, 4, 6, 7 }, 
		                  { 0, 1, 4, 6 }, 
		                  { 2, 0, 1, 4 } 
		                }; 
		
		System.out.println(isToeplitz(toeplitz));
		//System.out.println(isToeplitz(mat));
		} }
