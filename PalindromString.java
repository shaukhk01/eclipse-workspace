/**
 * write a program to check Give
 * String is Palindrom or not
 * @author hector
 *
 */
public class PalindromString {

	
	public static boolean palindrom(char[]p,int n) {
		
		char[]rev= new char[n];
		int j=0;
		for(int i=n-1;i>=0;i--,j++) {
			
			rev[j] = p[i];
		}
		int i=0;
		while(n !=i) {
			if(p[i] !=rev[i]) {
				return false;
			}
			i++;
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		String pdm = "madam";
		//String pdm = "121";
		
		char[] cI = pdm.toCharArray();
		
		if(palindrom(cI,cI.length)){
			System.out.println("true");
		}
		else
			System.out.println("false");

	}

}
