//multiple element missing in sorted array.
public class MultipleMissingElement {

	public static void findMultiple(int[]s,int m) {
		
		int diff = s[0];
		int i=0;
		int j=0;
		while(i !=m) {
			
			if(s[i] - i !=diff) {
				System.out.print(diff+i+",");
				diff = s[i]-i;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		
		int sorted[] = {4,5,6,7,8,10,12,13,14,16};
		int m = sorted.length;
		findMultiple(sorted,m);

	}

}
