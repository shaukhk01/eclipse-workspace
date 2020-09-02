package AdtPractice;

public class ExampleArrangeElement {

	public static void shift(int[]a,int n) {
		
		int j = n;
		int i=0;
		int temp;
		
		while(i<j) {
			
			if(a[i]<0)
				i++;
			else if(a[j]>0)
				j--;
			else if(a[i]>0 && a[j]<=0) {
				
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
	}
		
	public static void main(String[] args) {

		int[] e = {-1,3,-4,2,-5,6,-8,7,9,10,11,12};
		
		shift(e,e.length-1);
		
		for(int i=0;i<e.length;i++)
			System.out.print(e[i]+",");
	}

}
