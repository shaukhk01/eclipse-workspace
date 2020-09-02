package AdtPractice;

public class ExamplePolynomial {

	public static void polynomial(int b,int p) {
		
		for(int i=0;i<1;i++) {
			
			if(b !=0 && p !=0) {
				System.out.print(b+"x^"+p+"+");
			}
			else if(!(p!=0)){
			System.out.print(b+"");	
			}
		}
	}
	public static void main(String[] args) {
		
		polynomial(5,4);
		polynomial(2,1);
		polynomial(5,0);

	}

}
