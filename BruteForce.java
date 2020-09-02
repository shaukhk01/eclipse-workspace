
public class BruteForce {

	static int[] A = new int[9];
	static char[] res = new char[9];
	
	public static void bruteForce(char[]s,int k) {
		
		if(s[k] =='\000') {
			
			for(int i=0;i<res.length-1;i++) 
				System.out.print(res[i]+" ");
			System.out.println();
				
		}
		else {
		
		for(int i=0;i<s.length-1;i++) {
			
			if(A[i] ==0) {
				res[k] = s[i];
				A[i] = 1;
				bruteForce(s,k+1);
				A[i] = 0;
			}
		}
	}
}
	public static void main(String[] args) {

		//char[] s = {'a','b','c','\000'};
		//char[] s = {'x','y','z','0','\000'};
		char[] s = {'A','3','e','2','d','5','d','a','\000'};
		bruteForce(s,0);
		res[8] = '\000';
	}
}
