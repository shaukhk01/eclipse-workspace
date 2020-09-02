
public class CountingSortExample {

	static int[] count = new int[11];
	static int[] sortedArray = new int[10];
	public static void hash(int[]q,int N) {
		
		for(int i=0;i<=N;i++) {
			
			count[q[i]]++;
		}
		
		for(int i=1;i<count.length;i++) {
			
			count[i] = (count[i] + count[i-1]);
		}
		
		for(int i=N;i>=0;i--) {
			
			sortedArray[--count[q[i]]] = q[i];
		}
		
		printCountSort(sortedArray);
	}
	
	public static void printCountSort(int[]print) {
		
		
		for(int i=0;i<print.length;i++)
			System.out.print(print[i]+",");
	}
	public static void main(String[] args) {

	//	int[] q = {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
		
		int[] q = {5,3,2,6,1,9,4,7,8,10};
		hash(q,q.length-1);
	}

}
