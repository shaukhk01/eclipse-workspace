//if element are not start with N natural number but sorted
public class FindSingleMissingElement {
	
	public static void findSingle(int[]find,int n) {
		
		int diff = find[0];
		int i=0;
		
		while(i !=n) {
			if(find[i] - i !=diff) {
				System.out.println(diff + i);
				break;
			}
			i++;
			
		}
		
	}
	public static void main(String[]args) {
		
		int[] sorted = {6,7,8,10,11,12,13,14,15,16};
		
		int n = sorted.length;
		findSingle(sorted,n);
		
	}

}
