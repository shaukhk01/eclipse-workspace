package AdtPractice;

public class ExampleFindDuplicateCharacter {

	public static void duplicate(char[]ch) {
		
		int[] hash = new int[25];
		
		for(int i=0;i<ch.length;i++) {
			
			hash[ch[i]-97]++;
		}
		
		for(int i=0;i<hash.length;i++) {
			
			if(hash[i]>1) {
				
				int c =(char)i+(char)97;
				char d = (char)c;
				System.out.print(d);
		}
	}
			System.out.println("==> are duplicate.");
	}
	
	public static void main(String[]args) {
		String s = "finding";

		char[] ch = s.toCharArray();
		duplicate(ch);
	}
}
