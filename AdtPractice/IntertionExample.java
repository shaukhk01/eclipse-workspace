package AdtPractice;

public class IntertionExample {

	public static void insertionSort(int[]a,int n) {
		
		int j,temp;
		for(int i=1;i<n;i++) {
			
			j=i-1;
			temp = a[i];
			while(j > -1 && a[j] > temp) {
					a[j+1] = a[j];
					j--;
				}
			a[j+1] = temp;
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s = {8,3,7,4,9,2,6,5};
		
		insertionSort(s,s.length);
		
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+",");

	}

}
