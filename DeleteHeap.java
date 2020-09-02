
public class DeleteHeap {

	public static void delete(int[]a,int n) {
	
		int x,i,j,temp;
		x = a[n];
		a[1] = a[n];
		i=1;
		j = 2*i;
		
		while(j<n-1) {
		if(a[j+1] > a[j])	
			j = j+1;
		if(a[i]<a[j]) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			i=j;
			j=2*j;
		}
		else
			break;
	}
}
		
	public static void main(String[] args) {
		
		int[]delete = {0,40,35,30,15,10,25,5};
		
		delete(delete,delete.length-1);
		
		for(int i=1;i<delete.length-1;i++)
			System.out.print(delete[i]+" ");
			
	}
}