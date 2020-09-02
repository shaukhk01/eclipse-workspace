package AdtPractice;

public class InsertionExample {

	public static void insertion(int[]a,int N) {
		
		int temp;
		int j;
		for(int i=1;i<=N;i++) {
			j = i-1;
			temp = a[i];
			while(j>-1 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1] = temp;
		}
	}
	public static void main(String[] args) {

		int[] i = {8,3,7,4,9,2,6,5};
		
		insertion(i,i.length-1);
		
		for(int x=0;x<i.length;x++)
			System.out.print(i[x]+",");
	}

}
