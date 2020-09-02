package AdtPractice;

public class SelectionSortExample {

	public static void selection(int[]a) {
		int k=0;
		for(int i=0;i<a.length;i++) {
			k=i;
			for(int j=1+i;j<a.length;j++) {
				
				if(a[k]>a[j]) {
					k=j;
				}
			}
			
			swap(a,i,k);
		}
		
		
	}
	
	private static void swap(int[]a,int i,int k) {
		
		int temp = a[i];
		a[i] = a[k];
		a[k] = temp;
	}
	public static void main(String[] args) {

//		int[] s = {8,3,7,4,9,2,6,5};
		int[] s = {8,3,7,4,9,2,6,5,3,2,7};
		selection(s);
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+",");
	}

}
