//find minimum and maximum from array.
public class MaxMin {

	public static void findMaxMin(int[]mm,int n) {
		
		int max = mm[0];
		int min = mm[0];
		
		for(int i=1;i<n;i++) {
			
			if(mm[i]<min) {
				min = mm[i];
			}
			else if(mm[i]>max) {
				max = mm[i];
			}
		}
		System.out.print("min: "+min+"      max: "+max);
	}
	public static void main(String[] args) {
		
		int[]mm = {4,2,1,-1,10,12,3,5};

		int n = mm.length;
		findMaxMin(mm,n);
	}

}
