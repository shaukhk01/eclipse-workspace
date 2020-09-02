
public class FindAnagram {

	public static boolean anagram(char[]sI,char[]sII,int n) {
		
		int[] h = new int[26];
		
		for(int i=0;i<n;i++) {
			
			h[sI[i]-97]+=1;
			
			for(int j=0;j<sII.length;j++) {
				
				if(sI[i] == sII[j]) {
					
					h[sI[i]-97]-=1;
				}
			}
			
		}
		
		for(int i=0;i<h.length;i++) {
			
			if(h[i] !=0) {
				
					return false;
			}
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		String sI = "decimalabc";
		String sII= "medical";

		char[]cI = sI.toCharArray();
		char[]cII= sII.toCharArray();
		
		System.out.println(anagram(cI,cII,cI.length));
		
	}

}
