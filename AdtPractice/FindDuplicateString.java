package AdtPractice;

public class FindDuplicateString {
	
	static int[] h = new int[26];
	public static void findDuplicate(char[]d,int n) {
		
		for(int i=0;i<n;i++) {
			
			h[d[i]-97]+=1;
			
			for(int j=0;j<h.length;j++) {
				
				if(h[j]>1) {
					int r = j+97;
					System.out.println((char)r);
					h[j] -=1;
			}
		}
	}
	}
	public static void main(String[]args) {
		
		String duplicate = "finding";
		
		char[] d = duplicate.toCharArray();
		int n = d.length;
		findDuplicate(d,n);
	
	}

}
