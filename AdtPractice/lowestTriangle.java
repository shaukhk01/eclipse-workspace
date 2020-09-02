package AdtPractice;

public class lowestTriangle {
	
	public static void lowerTriangle(int[][]tri) {
		
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<4;j++)
				if(i>j)
					System.out.print("0"+" ");
				else
					System.out.print(tri[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[]args) {
		
	 int a[][] = {{ 1, 2, 3, 4 }, 
                 { 5, 6, 7, 8 }, 
                 { 1, 2, 3, 4 }, 
                 { 5, 6, 7, 8 }}; 
	 
	 lowerTriangle(a);
	}

}
