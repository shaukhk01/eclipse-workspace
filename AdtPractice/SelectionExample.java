package AdtPractice;

public class SelectionExample {
	
	public static void selection(int[]s,int n) {
		int k=0,temp;
		for(int i=0;i<n;i++) {
			k = i;
			for(int j=i+1;j<n;j++) {
				
				if(s[k] > s[j] && s[i] > s[j])
					k = j;
			}
			
			temp = s[i];
			s[i] = s[k];
			s[k] = temp;
		}
		
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+",");
	}
	public static void main(String[]args) {
		
	   int[] q = {11,13,7,12,16,9,24,5,10,3};
//		int[] q = {8,6,3,2,5,4};
	   selection(q, q.length);
	}

}
