
public class CountVowelAndWords {

	public static void vowel(char[]v,int n) {
		System.out.print("vowel: ");
		for(int i=0;i<n;i++) {
			if(v[i]== 'A'|| v[i]== 'E'|| v[i]=='I' || v[i]=='O'|| v[i] == 'U'|| 
			   v[i]== 'a'|| v[i]== 'e'|| v[i]=='i' || v[i]=='o'|| v[i] == 'u') {
				
				System.out.print(v[i]+",");
			}
		}
	}
	
	public static int word(char[]w,int n) {
		int space=0;
		for(int i=0;i<n;i++) {
			if(w[i] == ' ') {
				space++;
			}
		}
		return 1+space;
	}
	public static void main(String[] args) {

		String s = "How Are You Fine.";
		
		char []v = s.toCharArray();
		int n = v.length;
		vowel(v,n);
		System.out.println();
		System.out.println(word(v,n));
	}

}
