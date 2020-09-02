
/**
 * sparse matrix 
 * @author hector
 *
 */
public class DataSparseFormat {

	static int N;
	static int M;
	public DataSparseFormat(int N,int M) {
		this.N = N;
		this.M = M;
	}
	public static void sizeOfSparse(int[][]sm) {
		
		int size =0;
		for(int i=0;i<N;i++) {
			
			for(int j=0;j<M;j++)
				if(sm[i][j] !=0)
					size++;
		}
		int tcr[][]  = new int[3][size];
		
		applySparseLogic(sm,tcr);
	}
	
	public static void printData(int [][]data) {
		
		for(int i=0;i<data.length;i++) {
			
			for(int j=0;j<data[0].length;j++)
				System.out.print(data[i][j]+" ");
			System.out.println();
		}
		
	}
	
	public static void applySparseLogic(int[][]sm,int tcr[][]) {
		
		int k = 0;
		for(int i=0;i<N;i++) {
			
			for(int j=0;j<M;j++) {
				
				if(sm[i][j] !=0) {
					tcr[0][k] = i;
					tcr[1][k] = j;
					tcr[2][k] = sm[i][j];
					k++;
				}
			}
		}
		printData(tcr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat= {{0,0,0,0,0,0,0,3,0},
				      {0,0,8,0,0,10,0,0,0},
				      {0,0,0,0,0,0,0,0,0},
				      {4,0,0,0,0,0,0,0,0},
				      {0,0,0,0,0,0,0,0,0},
				      {0,0,2,0,0,0,0,0,0},
				      {0,0,0,6,0,0,0,0,0},
				      {0,9,0,0,5,0,0,0,0},
			         };
		
		int x = mat.length;
		int y = mat[0].length;
		new DataSparseFormat(x,y);
		sizeOfSparse(mat);
		
		}
	}
