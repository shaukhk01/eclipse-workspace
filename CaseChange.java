/**
 * case change upper to lower
 * lower to upper from char array.
 * @author hector
 *
 */
public class CaseChange {

	public static void toLower(char[]c,int n) {
		
		int lower = 0;
		for(int i=0;i<n;i++) {
			
			if(c[i] >=65 && c[i]<=90) {
				
				lower = c[i]+32;
				System.out.print((char)lower+",");
			}
			else
				System.out.print(c[i]+",");
		}
		
	}
	
	public static void toUpper(char[]u,int n) {
		
		int upper=0;
		for(int i=0;i<n;i++) {
			
			if(u[i]>=97 && u[i]<=122) {
				upper = u[i] - 32;
				System.out.print((char)upper+",");
			}
			else
				System.out.print(u[i]+",");
		}
	}
	
	public static String toUper(char[]u,int n) {
		
		int upper;
		char[] c = new char[n];
		for(int i=0;i<n;i++) {
			
			if(u[i]>=97 && u[i]<=122) {
				upper = u[i] - 32;
				c[i] = (char)upper;
				
			}
			else
				c[i] = u[i];
		}
		return(String.valueOf(c)); 
	}
	
	public static void main(String[] args) {
		
		char[] ch= {'A','B','C','D','e','F'};
		
		toLower(ch,ch.length);
		System.out.println();
		
		char[]chII = {'a','b','c','d','E','F'};
		
		toUpper(chII,chII.length);
		System.out.println();
		System.out.println();
		System.out.println();
		String name="annie";
		char[] cname = name.toCharArray();
		
		String ename = toUper(cname,cname.length);
		System.out.println("Employee Name: "+ename);
	}

}
