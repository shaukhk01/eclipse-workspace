/**
 * Find duplicatee string from array
 * using hashTable
 * @author hector
 *
 */
public class DuplicateString {

	
	public static void duplicate(char[]d,int n) {
		
		int[] hash = new int[25];
		
		for(int i=0;i<n;i++) {
			
			hash[d[i]-97]+=1;
		}
		
		for(int i=0;i<hash.length;i++) {
			
			if(hash[i]>1) {
				int data = i+97;
				System.out.print((char)data+",");
				System.out.print(hash[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		
		String duplicate = "finding";
		
		char[]d = duplicate.toCharArray();

		duplicate(d,d.length);
	}

}
