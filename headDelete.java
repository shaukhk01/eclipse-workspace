//delete from heap 
public class headDelete {
	
	public static void insert(int[]a,int n) {
		
		int i=n; 
		int temp = a[n];
		
		while(i>1 && temp>a[i/2]) {
			a[i] = a[i/2];
			
			i = i/2;
		}
		a[i] = temp;
	}
	
	public static void delete(int[]d,int n) {
		
		int j, i =1;
		d[i] = d[n];
		j = 2*i;
		int temp;
		
		while(j<n-1) {
			if(d[j+1] > d[j])
				j = j+1;
			if(d[i] < d[j]) {
				
				temp = d[i];
				d[i] = d[j];
				d[j] = temp;
				i = j;
				j = 2*j;
			}
			else
				break;
		}
	}
	public static void main(String[]args) {
		
		int[] insert = {0,10,20,30,25,5,40,35};
		
		for(int i=2;i<insert.length;i++)
			insert(insert,i);
		
		for(int i=1;i<insert.length;i++)
			System.out.print(insert[i]+" ");
		
		System.out.println();
		System.out.println();
		
		insert(insert,insert.length-1);
		for(int i=1;i<insert.length-1;i++)
			System.out.print(insert[i]+" ");
		
	}

}
