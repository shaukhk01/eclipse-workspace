package AdtPractice;

public class ExampleRotation {

	public static void pass(int[]a,int k,int n) {
		
		for(int i=0;i<k;i++)
			leftRotate(a,n);
	}
	public static void leftRotate(int[]a,int n) {
		
		int temp = a[0];
		int i;
		for(i=0;i<n-1;i++)
			a[i] = a[i+1];
		a[i] = temp;
	}
	public static void main(String[] args) {

		int[] r = {1,2,3,4,5,6,7};
		
		pass(r,2,r.length);
		
		for(int i=0;i<r.length;i++)
			System.out.print(r[i]+",");
	}

}
