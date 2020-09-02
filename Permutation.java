
public class Permutation {
	
	static int[] A   = new int[4];
	static char[] res = new char[4];
	public static void perm(char[]s,int k) {
		
		
		if(s[k] =='\000' ) {
			for(int i=0;i<res.length-1;i++)
				System.out.print(res[i]+" ");
			System.out.println();
		}
		else
		{
			for(int i=0;i<s.length-1;i++) {
				if(A[i]==0) {
				res[k] = s[i];	
				A[i] = 1;
				perm(s,k+1);
				A[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {

		
		char[] s = {'A','B','C','\000'};
		res[3] = '\000';
		perm(s,0);
	}

}
