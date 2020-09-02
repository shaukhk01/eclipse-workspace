//adding sparse matrix is remaining please solve it

public class AddSparseMatrix {

	static int N;
	static int M;
	public AddSparseMatrix(int N,int M) {
		this.N= N;
		this.M = M;
	}
	
	public static int Generat_Three_RowColumn(int[][]dataI) {
		
		int size = 0;
		for(int i=0;i<N;i++) {
			
			for(int j=0;j<M;j++) {
				
				if(dataI[i][j] !=0)
					size++;
			}
		}
		return size;
		
//		int[][] tcrI = new int[3][size];
//		int[][] tcrII = new int[3][size];
				             //[3]i.e-->row[0],col[1],data[2] 
		
	}
	
	
//	public static void RepresentValueTRC(int[][]dI,int[][]dII,int[][]tcrI,int[][]tcrII) {
	
	
	public static void printData(int[] dataI[],int [][]dataII) {
		
		for(int i=0;i<dataI.length;i++) {
			
			for(int j=0;j<dataI[0].length;j++)
				System.out.print("  "+dataI[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		System.out.println("          +");
		System.out.println();
		for(int i=0;i<dataII.length;i++) {
			
			for(int j=0;j<dataII[0].length;j++)
				System.out.print("  "+dataII[i][j]+" ");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("____________________________");
		System.out.println();
		
		applyLogicAddOfSparseMatrix(dataI,dataII);
	}
	
	public static void applyLogicAddOfSparseMatrix(int dataI[][],int[]dataII[]) {
		//for dataI
		int drI =0;
		int dcI =0;
		
		//for dataII
		int drII = 0;
		int dcII = 0;
		int k = 0;
		int[][] result = new int[3][11];
		int row=0;
		//while(i<smI[0].length && j<smII[0].length) {
		while (drI <dataI[0].length  && dcII < dataII[0].length) {
			
			if(dataI[drI][dcI] == dataII[drII][dcII]) {
				row++;
				if(dataI[drI][dcI] == dataII[drII][dcII] && dataI[row][dcI] == dataII[row][dcII] ) {
					
					result[0][k] = dataI[0][dcI];
					result[1][k] = dataI[1][dcI];
					result[2][k] = dataI[2][dcI] + dataII[2][dcII];
					k++;
					
					dcI++;
					dcII++;
					row--;
				}
			}
				
				if(dataI[drI][dcI] < dataII[drII][dcII] ) {
						
					result[0][k] = dataI[0][dcI];
					result[1][k] = dataI[1][dcI];
					result[2][k] = dataI[2][dcI];
					
					dcI++;
					k++;
			 }
				else if(dataI[drI][dcI] > dataII[drII][dcII] ) {
						
					result[0][k] = dataI[0][dcII];
					result[1][k] = dataI[1][dcII];
					result[2][k] = dataI[2][dcII];
					k++;
					dcII++;
					
		}
	}
}

	public static void RepresentValueTRC(int[][]dI,int[][]dII) {
		
		int sizeI = Generat_Three_RowColumn(dI);
		int sizeII = Generat_Three_RowColumn(dII);
		
		int[][] tcrI = new int[3][sizeI];
		int[][] tcrII = new int[3][sizeII];
		
		int k = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				
				if(dI[i][j] !=0) {
					
					tcrI[0][k] = i;
					tcrI[1][k] = j;
					tcrI[2][k] = dI[i][j];
					k++;
				}
			}
		}
		
		k = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(dII[i][j] !=0) {
					tcrII[0][k] = i;
					tcrII[1][k] = j;
					tcrII[2][k] = dII[i][j];
					k++;
				}
				
			}
		}
		printData(tcrI,tcrII);
	}
	
	public static void main(String[] args) {
	int[][] dataI = {   {0,0,0,6,0,0},
						{0,7,0,0,0,0},
						{0,2,0,5,0,0},
						{0,0,0,0,0,0},
					    {4,0,0,0,0,0},
					};
	int dr = dataI.length;
	int dc = dataI[0].length;
					


	int[][] dataII = {{0,0,0,0,0,0},
					 {0,3,0,0,5,0},
					 {0,0,2,0,0,7},
					 {0,0,0,9,0,0},
					 {8,0,0,0,0,0},
					};
	new AddSparseMatrix(dr,dc); 
	RepresentValueTRC(dataI,dataII);
	
	}
}
