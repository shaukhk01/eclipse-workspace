/**
 *  int sparseMatrix[][] 
                = { 
                    {0, 0, 3, 0, 4}, 
                    {0, 0, 5, 7, 0}, 
                    {0, 0, 0, 0, 0}, 
                    {0, 2, 6, 0, 0} 
                }; 
 * @author hector
 *
 */
public class SparseMatrixExample {

	static int row = 4;
	static int col = 5;
	public static void sparse(int[] sm[]) {
		
	int size=0;
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				if(sm[i][j] !=0) 
					size++;
					
			}
		}
	int[][] tcr = new int[3][size];
	threeColRow(tcr,sm);
	}
	
	public static void threeColRow(int[][]tcr,int sm[][]) {
		int k=0;
		for(int x=0;x<row;x++) {
			for(int j=0;j<col;j++) {
				if(sm[x][j] !=0)
				{
					tcr[0][k] = x;
					tcr[1][k] = j;
					tcr[2][k] = sm[x][j];
					
				k++;
				}
			}
		}
		disp(tcr);
	}
	public static void disp(int[][]tcr) {
		
		for(int i=0;i<tcr.length;i++) {
			
			for(int j=0;j<tcr[0].length;j++) {
				
				System.out.print(tcr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		 int sparseMatrix[][] 
	                = { 
	                    {0, 0, 3, 0, 4}, 
	                    {0, 0, 5, 7, 0}, 
	                    {0, 0, 0, 0, 0}, 
	                    {0, 2, 6, 0, 0} 
	                }; 
		 sparse(sparseMatrix);
	}

}
