
public class SellSortExample {

	public static void shell(int[]a,int N) {
		int i;
		for(int gap=N/2;gap>=1;gap=gap/2) {
			
			for(int j=gap;j<=N;j++) {
				
				for(i=j-gap;i>=0;i=i-gap) {
					
					if(a[i+gap] > a[i]) {
						break;
					}
					else
						swap(a,i+gap,i);
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

		int[] sell= {9,5,16,8,13,6,12,10,4,2,3};
		
		shell(sell,sell.length-1);
		
		for(int i=0;i<sell.length;i++)
			System.out.print(sell[i]+",");
		
	}

}
