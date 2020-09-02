
public class Rotation {

	public static void rotate(char[] design,int k,int m) {
		
		int mod = k%m;
		
		for(int i=0;i<m;i++) {
//			System.out.print(design[i]+",");
			System.out.print(design[(i+mod)%m]+",");
		}
		
	}
	public static void main(String[] args) {
		
		char[] welcome = {'w','e','l','c','o','m','e'};
		
		int m = welcome.length;
		
		int k = 0;
		rotate(welcome,k,m);
		System.out.println();
		
		 k = 1;
		rotate(welcome,k,m);
		
		System.out.println();
		 k = 2;
		rotate(welcome,k,m);
		
		System.out.println();

		k = 3;
		rotate(welcome,k,m);
		System.out.println();
	}

}
