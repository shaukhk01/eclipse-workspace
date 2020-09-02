package AdtPractice;

public class ExampleBubbleSort {

	public static void bubble(int[]a,int N) {
		int temp;
		
		for(int i=0;i<N;i++) {
			
			for(int j=1+i;j<=N;j++) {
				
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0;i<=N;i++) {
			System.out.print(a[i]+",");
		}
		
	}
	public static void main(String[] args) {

		int[] bubble = {8,3,7,4,3,2,6,5};
		
		bubble(bubble,bubble.length-1);
		
			
	}

}
