package AdtPractice;

public class ExampleMissingElement {

	public static void find(int[]f,int n) {
		
		int last = f[1]-1;
		for(int i=1;i<n;i++) {
			
			if(f[i]-1 !=last) {
				
			}
		}
	}
	public static void main(String[] args) {

		int[] element = {0,2,3,4,5,7,9,10};
		find(element,element.length-1);
	}

}
