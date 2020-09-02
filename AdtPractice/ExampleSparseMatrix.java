package AdtPractice;

public class ExampleSparseMatrix {

		static int row = 4;
		static int col = 5;
	public static void sparse(int[][]sm) {
		
		int size=0;
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				if(sm[i][j] !=0)
					size++;
			}
		}
		
		//System.out.println(size);
		int tcr[][] = new int[3][size];
		applySparseMatrixAlgo(tcr,sm);
	}
	
	public static void applySparseMatrixAlgo(int[][]tcr,int[][]sm) {
		int k=0;
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				
				if(sm[i][j] !=0) {
					
					tcr[0][k] = i; 
					tcr[1][k] = j;
					tcr[2][k] = sm[i][j];
					
					k++;
				}
			}
		}
		
		for(int i=0;i<tcr.length;i++) {
			for(int j=0;j<tcr[0].le;j++)
				System.out.print(tcr[i][j]+" ");
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
