/**
 *represent a prolynomial using array.
 * write a program for polynomial and 
 * 
 * @author hector
 *
 */
public class AddOfPolynomial {

	public static void addPoly(int[][]poly,int[][]polyII) {
		int[][] p = new int[2][4];
		int[][] pI = new int[2][5];
		int k =0;
		int j=0;
		int z=1;
		//first polynomial equation
		for(int i=0;i<poly[0].length;i++) {
			
			p[0][k] = poly[j][k]; 
			p[1][k] = poly[z][k];
			k++;
		}
		k=0;
		j=0;
		z=1;
		//second polynomial equation
		for(int i=0;i<polyII.length-1;i++) {
			
			for(int w=0;w<polyII[0].length;w++) {
			pI[0][k] = polyII[0][k]; 
			pI[1][k] = polyII[z][k];
			k++;
		}
		}
			System.out.println();
			System.out.println();
		for(int i=0;i<p.length;i++) {
			
			for(int x = 0;x<p[0].length;x++) {
				System.out.print(p[i][x]+" ");
			}
			System.out.println();
		}
		
			System.out.println();
			System.out.println();
		
		for(int pII=0;pII<pI.length;pII++) {
			
			for(int e=0;e<pI[0].length;e++)
				System.out.print(pI[pII][e]+" ");
			System.out.println();
		}//addPolynomial(p,pI);
	}
	
/*	public static void addPolynomial(int[][]eI,int[][]e2) {
		int i=0;
		int j=0;
		int k=0;
		int[][] pol = new int[2][5];
		while(j !=e2[0].length) {
			if(eI[1][i] == e2[1][j]) {
				pol[0][k] = eI[0][i] + e2[0][j];
				pol[1][k] = eI[1][i];
				//System.out.print(pol[0][k]);
				//System.out.print(pol[1][k]);
			j++;
			i++;
			k++;
			}
			
			else if(eI[1][i] < e2[1][j]) {
				
				pol[0][k] = e2[0][j]; 
				pol[1][k] = e2[1][j];
				//System.out.print(pol[0][k]);
				pol[1][k] = e2[1][j];
				
				k++;
			}
			else {
				pol[0][k] = eI[0][i];
				pol[1][k] = eI[1][i];
			}
			
				
			}
		
		for(int e=0;e<pol.length;e++) {
			
			for(int b=0;b<pol[0].length;b++) {
				System.out.print(pol[e][b]+" ");
			}
			System.out.println();
		}
		}*/
	public static void main(String[] args) {

	//pI:5x^4+2x^2+5  
	//pII:6x^4+5x^3+9x^2+2x+3
		
		int[][] pI = {{5,2,5,6},
			          {4,2,0,6}
			         };
		
		int[][] pII = {{6,5,9,2,3},
			          {4,3,2,1,0},
			         };
		addPoly(pI,pII);
		System.out.println();
		}
	}
