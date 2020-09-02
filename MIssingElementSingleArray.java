//if give array is First start with N natural number [natural = maxelement(maxelement+1)/2
public class MIssingElementSingleArray {

	public static void findElement(int f[],int n) {
	int sum=0;
	int x = f[n-1];
	
	//x:-is maximum element present in array.
	int sub = x*(x+1)/2;
	
	for(int i=0;i<n;i++)
		sum +=f[i];
	
	System.out.println(sub - sum );
	}
	
	public static void main(String[] args) {

		int[] sorted= {1,2,3,4,5,6,8,9,10};//start with N natural number
		int n = sorted.length;
		
		findElement(sorted,n);
	}

}
