package AdtPractice;

public class BubbleSortExample {

	public static void bubbleSort(int[]b,int n) {
		int temp;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if(b[i] > b[j]) {
					
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
			
		}
	}
	public static void main(String[]args) {
		
	  int[] q = {11,13,7,12,16,9,24,5,10,3};
//		int[] q = {8,5,7,3,2};
	  bubbleSort(q,q.length);
	  for(int i=0;i<q.length;i++)
		  System.out.print(q[i]+",");
	}
}
