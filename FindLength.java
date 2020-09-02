
public class FindLength {

	public static void main(String[] args) {
		
		String s = "welcome ";
		
		char[] ch = s.toCharArray();
		int count=0;
		for(int i=0;ch[i] !=' ';i++) {
				count++;
		}
		System.out.println("length: "+count);
		System.out.println("length: "+s.length());
		

	}

}
