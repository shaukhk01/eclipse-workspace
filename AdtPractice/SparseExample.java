package AdtPractice;

public class SparseExample {

	static int N=5;
	static int M=6;
	public static void makingThreeCR(int[][]sparse) {
		int size=0;
		for(int i=1;i<N;i++) {
			
			for(int j=1;j<M;j++) {
				
				if(sparse[i][j] !=0)
					size++;
			}
		}
		
		int[][] newSparse = new int[4][size+1];
		
		sparse(sparse,newSparse,size);
	}
	public static void sparse(int[][]sparse,int[][]s,int size) {
		
		int k=1;
		for(int i=1;i<N;i++) {
			
			for(int j=1;j<M;j++) {
				
				if(sparse[i][j] !=0) {
					s[1][k] = i;
					s[2][k] = j;
					s[3][k] = sparse[i][j];
					k++;
				}
			}
		}
		
		disp(s);
		}
	public static void disp(int[][]tcr) {
		
		for(int i=1;i<tcr.length;i++) {
			
			for(int j=1;j<tcr[0].length;j++) {
				
				System.out.print(tcr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
					   
						 
		int[][] spars =  {{0,0,0,0,0,0,},
						 {0,0,0,3,0,4},
					     {0,0,0,5,7,0},
					     {0,0,0,0,0,0},
					     {0,0,2,6,0,0},
						};
		
		makingThreeCR(spars);
		
			
		}
	}
