/**
 * Bubble sort we can also reterive last three greatest value
 * if Bubble sort is already sorted then we can made as adaptive.
 * @author hector
 *
 */
public class BubbleSort {

	public static void bubble(int[]b,int n) {
		
		int temp;
		int flag;
		for(int i=0;i<n;i++) {
int k = 0;			
		flag =0;
			for(int j=1;j<n;j++,k++) {
				
				if(b[k] > b[j]) {
				temp = b[k];
				b[k] = b[j];
				b[j] = temp;
				flag = 1;
				}
			}
			
			if(flag ==0) {
				System.out.println("adaptive");
				break;
			}
		} 
		for(int i=0;i<n;i++)
			System.out.print(b[i]);
	}
	public static void main(String[] args) {

		//int[] bubble = {8,5,7,3,2};
		//if element is already sorted then bubble we can made bubble as as adaptive
		int[] bubble = {1,2,3,4,5};
		
		bubble(bubble,bubble.length);
	}

}
