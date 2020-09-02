
public class ExampleShell {

	protected static void shellSort(int[]a,int N) {
		
		int gap;
		for(gap=N/2;gap>=1;gap=gap/2) {
			
			for(int j=gap;j<=N;j++) {
				
				for(int i=j-gap;i>=0;i=i-gap) {
					
					if(a[i+gap] > a[i])
						break;
					else
						swap(a,i,i+gap);
				}
			}
		}
	}
	
	private static void swap(int[]a,int i,int gap) {
		
		int temp = a[i];
		a[i] = a[gap];
		a[gap] = temp;
	}
	public static void main(String[] args) {

		int[] shell = {8,3,7,4,9,2,6,5};
		
		shellSort(shell,shell.length-1);
		
		for(int i=0;i<shell.length;i++)
			System.out.print(shell[i]+",");
	}

}
