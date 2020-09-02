package AdtPractice;

public class Transpose {
	
	public static void transpose(int[][]trans) {
		
		int[][] tr = new int[3][3];
		
		for(int i=0;i<trans.length;i++) {
			
			for(int j=0;j<trans.length;j++)
				
				tr[i][j] = trans[j][i];
				
		}
		
		for(int i=0;i<tr.length;i++) {
			for(int j=0;j<tr.length;j++)
				System.out.print(tr[i][j]+" ");
		System.out.println();
		}
	}

	public static void main(String[] args) {
		
		 int mat[][] = { { 1, 2, 3 }, 
                 { 4, 5, 6 }, 
                 { 7, 8, 9 } };
		 
		 transpose(mat);
	}

}
