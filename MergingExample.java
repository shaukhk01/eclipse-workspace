//perform merge operation on sorted array
public class MergingExample {

	public static void merge(int[]x,int y[],int a,int b) {
		
		int z[] = new int[a+b];
		int k=0;
		int i=0;
		int j = 0;
		
		while(i<a && j<b) {
			
			if(x[i] < y[j]) {
				z[k++] = x[i++];
			}
			else
				z[k++] =y[j++];
		}
		
		for(;i<a;i++)
			z[k++] = x[i];
		for(;j<b;j++)
			z[k++] = y[j];
		
		for(int p=0;p<z.length;p++)
			System.out.print(z[p]+",");
		
	}
	public static void main(String[] args) {
		
		int A[] = {1,3,5,7,9,12,13,15,16};
		int B[] = {2,4,6,8,10,11,14};
		int m = A.length;
		int n = B.length;
		merge(A,B,m,n);

	}

}
