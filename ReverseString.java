/**
 * swap and normal ways to reverse String
 * 
 * @author hector
 *
 */
public class ReverseString {

	public static void reverse(char[]r,int n) {
		
		for(int i=n-1;i>=0;i--) {
			System.out.print(r[i]+",");
		}
	}
	
	public static void swapreverse(char[]s,int n) {
		
		char[] sw = new char[n];
		int temp;
		int m = n-1;
		for(int i=0;i<n;i++) {
			
			temp = s[i];
			sw[i] = s[m];
			sw[m] = (char)temp;
			m--;
		}
		
		for(int i=0;i<sw.length;i++) 
			System.out.print(sw[i]+",");
		
		
	}
	public static void main(String[] args) {

		String reverse = "python";
		
		char[] r = reverse.toCharArray();
		reverse(r,r.length);
		System.out.println();
		System.out.println();
		System.out.println();
		swapreverse(r,r.length);
	}

}
