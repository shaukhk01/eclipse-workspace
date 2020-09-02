//given element is unsorted we have to perform missing element.
public class FindMIssingSortedElement {

	public static int Find(int[]f,int n) {
		
		int Hash[] = new int[12+1];
		for(int i=0;i<f.length;i++) {
			
			Hash[f[i]]++;
		}
		
		for(int j=1;j<Hash.length;j++) {
		if(Hash[j] ==0) {
			
			return j;
		}
		
	}
		return 0;
		
	}
	public static void main(String[]args) {
		
		int[] unsorted= {2,3,1,4,5,7,8,6,10,9,12};
		
		System.out.println(Find(unsorted,unsorted.length));
		
	}
}
