
public class PolynomialExample {

	public static void polynomial(int b,int p) {
		
		for(int i=0;i<1;i++) {
			
			if(b !=0 && p !=0) {
			
				System.out.print(b+"x^"+p+"+");
				
			}
			else if( b!=0)
				System.out.print(b+"x^"+"");
		}
	}
	public static void main(String[] args) {

		polynomial(2,3);
		polynomial(4,2);
		polynomial(4,0);
		polynomial(0,5);
		
	}

}
