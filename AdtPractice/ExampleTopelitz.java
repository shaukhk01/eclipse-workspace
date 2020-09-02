package AdtPractice;

public class ExampleTopelitz {

	static int N = 5;
	static int M = 4;
	
	public static boolean isDaigonal(int[][]d,int i,int j) {
		
		int res = d[i][j];
		
		while(++i<N && ++j<M) {
			
			if(d[i][j] !=res)
				return false;
		}
		return true;
	}
	
	public static  boolean isToeplitz(int[][]t) {
		
		//each element in row
		for(int i=0;i<M;i++) {
			
			if(!(isDaigonal(t,0,i)))
					return false;
		}
		
		//each element in column 
		
		for(int i=0;i<N;i++) {
			
			if(!(isDaigonal(t,i,0)))
				return false;
		}
		
		return true;
	}
	public static void main(String[]args) {
		
		int[][] top = {{6,7,8,9},
				       {4,6,7,8},
				       {1,4,6,7},
				       {0,1,4,6},
				       {2,0,1,4},
			          };
		
		System.out.println(isToeplitz(top));
		}
		
	}
