//pair of element from sorted Array

public class PairOfElement {

	public static void pair(int[]p,int m) {
		int i =0;
		int j = m-1;
		int k = 10;
		while(i<=j) {
			
			if(p[i] + p[j] == k) {
				System.out.print(p[i]+","+p[j]+" ");
				i++;
				j--;
			}
			else if(p[i] + p[j] < k) {
				i++;
			}
			else
				j--;
		}
	}
	public static void main(String[] args) {
		
		int[] pair = {1,3,4,5,6,8,9,10,12,14};
		int m = pair.length;
		
		pair(pair,m);

	}

}
