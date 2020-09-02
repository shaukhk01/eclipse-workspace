package AdtPractice;

public class InsertionSortExample {

	public static void insertionSort(int[]I,int n) {
		int j,x;
		x = 0;
		int temp;
		for(int i=1;i<n;i++) {//no need to compare first we assume first is sorted
			j = i;
			while(j !=0) {
				if(I[j]< I[j-1]) {
					
					temp = I[j-1];
					I[j-1] = I[j];
					I[j] = temp;
//					System.out.print(I[j-1]+" "+I[j]);
				}
				j--;//because of backward traverse for comparing.
			}
		}
	}
	public static void main(String[]args) {
		
	  int[] q = {11,13,7,12,16,9,24,5,10,3};
//		int q[] = {8,5,7,3,2};
		insertionSort(q,q.length);
		
		for(int i=0;i<q.length;i++)
			System.out.print(q[i]+",");
	}
}
