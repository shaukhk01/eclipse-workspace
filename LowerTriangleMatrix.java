/**
 * write a program to print lowetriangle and upper trinable
 * lower:
 * input:       output:
 * 1 2 3 4      1 0 0 0
 * 5 6 7 8      5 6 0 0
 * 9 10 11      9 10 11
 ***************************
 *
 * upper:
 * input:       output:
 * 1 2 3 4      1 2 3 4
 * 5 6 7 8      0 6 7 8
 * 9 10 11      0 0 11
 * 
 * @author hector
 *
 */
public class LowerTriangleMatrix {

	
	public static void lowerTriangle(int[][]mat,int row,int col) {
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i<j)
					System.out.print("0"+" ");
				else
					System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void upperTriangle(int[][]mat,int row,int col) {
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				
				if(i>j)
					System.out.print("0"+" ");
				else
					System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int[][] lowest = {{1,2,3},
			         	  {4,5,6},
			         	  {7,8,9}
						 };
		
		int[][] upper = {{2,0,0,0},
			             {1,3,0,0},
			             {1,2,3,0},
			             {1,2,3,4}
						};
	
		int row = 3;
		int col = 3;
		
		lowerTriangle(lowest,row,col);
		
		System.out.println();
		System.out.println();
		upperTriangle(lowest,row,col);
		System.out.println();
		System.out.println();
		row = 4;
		col = 4;
		lowerTriangle(upper,row,col);
		System.out.println();
		System.out.println();
		upperTriangle(upper,row,col);
		}

	}
