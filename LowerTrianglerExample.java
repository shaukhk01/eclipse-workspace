
public class LowerTrianglerExample {

	static int N=3;
	static int M=3;
	public static void lower(int[][]a) {
		
		//upper
		for(int i=0;i<N;i++) {
			
			for(int j=0;j<M;j++) {

				if(i<=j)
					System.out.print(a[i][j]+" ");
				else if(i>j)
					System.out.print("0"+" ");
			}
				System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//lower
		for(int i=0;i<N;i++) {
			
			for(int j=0;j<M;j++) {
				
				if(i<j)
					System.out.print("0"+" ");
				else  
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		int[][]mat = {{1,2,3},
					  {4,5,6},
					  {7,8,9}
					  };
		
		lower(mat);
		}
	}
