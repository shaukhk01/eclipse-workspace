package AdtPractice;

public class ExampleInsertionSort {

	public static void insertion(int[]a,int n) {
		int i=0,j=1;
		int temp;
		while(i<n) {
			
			while(a[i]<a[j]) {
			if(a[j] < a[i]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
				j=j-i;
			}
			i++;
			j++;
		}
	}
	public static void main(String[] args) {

	}

}
