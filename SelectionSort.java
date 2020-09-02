
/**
 * Selection Sort algorithm
 * @author hector
 *
 */
public class SelectionSort {

	public static void selection(int[]s,int n) {
		int k;
		int temp;
		for(int i=0;i<n;i++) {
			k = i;
			for(int j=i+1;j<n;j++) {
				
				if(s[i] > s[j] && s[k]> s[j]) {
					
					k = j;
				}
				
			}
			
			temp = s[i];
			s[i] = s[k];
			s[k] = temp;
			
		}
		
		for(int i=0;i<n;i++)
			System.out.print(s[i]+" ");
	}
	public static void main(String[] args) {

	//	int[]selection = {8,6,3,2,5,4};
		int[]selection = {11,13,7,2,6,9,4,5,10,3};
		selection(selection,selection.length);
	}

}
