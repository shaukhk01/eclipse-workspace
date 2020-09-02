package AdtPractice;

public class PairOfElement {

	public static void pair(int[]f,int k) {
		
		int j = 1;
		
		for(int i=0;i<f.length;i++) {
			while(j<f.length) { 
		
			if(i == j && f[i]+f[j] ==10) {
				continue;
			}
			if(f[i]+f[j] == k) {
				System.out.println(f[i]+" "+f[j]);
				j=0;
				break;
			}
			else
				j++;
		}
	}
}
	public static void main(String[]args) {
		
//	int[] u = {1,2,4,3,6,8,9};	
	int []u = {4,8,3,2,6,5,9,1,7};
	int k = 10;
	pair(u,k);
	}
}
