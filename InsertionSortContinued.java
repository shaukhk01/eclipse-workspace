
public class InsertionSortContinued {
	

	public static void insertSortContinued(int[]ic,int n) {
		int j,x;
		for(int i=1;i<n;i++) {
			
			j = i-1;
			x = ic[i];
			
			while(j>-1 && ic[j]>x) {
				
				ic[j+1] = ic[j];
				j--;
			}
			ic[j+1] = x;
		}
		for(int i=0;i<ic.length;i++)
			System.out.print(ic[i]+" ");
	}
	public static void main(String[] args) {
		
		int[] isc = {11,13,7,2,6,9,4,5,10,3};
		int n = isc.length;
		insertSortContinued(isc,n);
		

	}

}
