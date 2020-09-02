
public class PairOFElement {
	
	public static void findPair(int[]e,int m) {
		
		int i=0;
		int j = m-1;
		int k = 10;
		
		while(i<=j) {
			
			if(e[i] + e[j] == k) {
				
				System.out.print(e[i]+","+e[j]+" ");
				i++;
				j--;
			}
			else if(e[i] + e[j] < k) {
				i++;
			}
			else
				j--;
		}
		
	}
	public static void main(String[]args) {
		
		int[] element = {1,3,4,5,6,8,9,10,12,14};
		
		int m = element.length;
		
		findPair(element,m);
	}

}
