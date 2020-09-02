package AdtPractice;

public class DigonalExample {

	public static void daigonal(int[][]d) {
		
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<4;j++) {
				if(i==j)
					System.out.print(d[i][j]+" ");
			}
		}
		
		System.out.println();
	}
	
	public static void main(String[]args) {
		
		 int a[][] = { { 1, 2, 3, 4 }, 
                 { 5, 6, 7, 8 }, 
                 { 1, 2, 3, 4 }, 
                 { 5, 6, 7, 8 } }; 
		 
		 daigonal(a);
		
	}
}
