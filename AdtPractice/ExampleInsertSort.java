package AdtPractice;

public class ExampleInsertSort {

	public static void insert(int[]a,int N) {
		int j,x;
		for(int i=1;i<=N;i++) {
			
			j = i-1;
			x = a[i];
			
			while(j>-1 && a[j]>x) {
				
				a[j+1] = a[j];
				j--;
			}
			
			a[j+1] = x;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		int[] insert = {0,8,3,7,4,2,6,5};
		
		insert(insert,insert.length-1);
		
		for(int i=0;i<insert.length;i++)
			System.out.print(insert[i]+",");

	}

}
