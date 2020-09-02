package AdtPractice;

public class ToeplitzExample {
	
	static int N=5;
	static int M=4;
	
	public static boolean isDaigonal(int[][]d,int i,int j) {
		
		int result = d[i][j];
		
		while(++i<N && ++j<M) {
			
			if(d[i][j] !=result)
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
		
		for(int j=0;j<N;j++) {
			
			if(!isDaigonal(t,j,0))
				return false;
		}
		return true;
	}
	public static void main(String[]args) {
		
		int[][] toeplitz = {{6,7,8,9},
						    {4,6,7,8},
						    {1,4,6,7},
						    {0,1,4,6},
						    {2,0,1,3}
		 				   };
		
		System.out.print(isToeplitz(toeplitz));
		}
	}
