
public class ExampleShellSort {

	
	public static void shellSort(int[]a,int N) {
		
		int gap;
		for(gap=N/2;gap>=1;gap=gap/2) {
			
			for(int j=gap;j<=N;j++) {
				
				for(int i=j-gap;i>=0;i=i-gap) {
					
					if(a[i+gap]> a[i]) {
						
						break;
					}
					
					else
						
						swap(a,i,i+gap);
				}
			}
		}
	}
	
	private static void swap(int[]a,int i,int j) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	
	public static void main(String[] args) {

		int[] s = {9,5,16,8,13,6,1,12,10,4,2,3};
		shellSort(s,s.length-1);
		
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+",");
	}

}
