//compare two String are equal are not
public class CompareString {
	
	public static boolean compare(char[]cI,char[]cII,int n) {
		
		
		int j=0;
		for(int i = 0;i<n;i++,j++) {
			
			if(!(cI[i] == cII[j])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String sI = "Painting";
		String sII= "Painting";
		
		char[] cI = sI.toCharArray();
		char[] cII= sII.toCharArray();

		if(compare(cI,cII,cI.length)) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}

}
