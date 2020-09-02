
public class ToeplitzExample {

	static int N = 5;
	static int M = 4;
	public static boolean isDaigonal(int[][]mat,int i,int j) {
		
		int result = mat[i][j];
		while(++i<N && ++j<M) {
			
			if(mat[i][j] !=result)
				return false;
		}
		return true;
		
	}
	
	public static boolean isToeplitz(int[][]mat) {
		
		//do for each element in first row
		for(int i=0;i<M;i++) {
			
			if(!isDaigonal(mat,0,i)) {
				return false;
			}
		} 
		
		for(int i=0;i<N;i++) {
			
			if(!isDaigonal(mat,i,0)) {
				return false;
			}
		}
   
        return true; 
    } 
		
	public static void main(String[] args) {

		  int mat[][] = { { 6, 7, 8, 9 }, 
		                  { 4, 6, 7, 8 }, 
		                  { 1, 4, 6, 7 }, 
		                  { 0, 1, 4, 6 }, 
		                  { 2, 0, 1, 4 } 
		                }; 
		  
		 System.out.println(isToeplitz(mat));
	}
	
	

}
