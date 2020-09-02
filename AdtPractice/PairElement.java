package AdtPractice;

public class PairElement {

	public static void hash(int[]a) {
		
		int hash[] = new int [9];
		int k =10;
		
		for(int i=0;i<a.length;i++) {
			
			hash[a[i]]++;
		}
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<hash.length;j++) {
				
				if(hash[j]>0 && j+a[i] == k) 
				System.out.print(j+","+a[i]+" ");
				
			}
		}
	}
		
	public static void main(String[] args) {
		
		int[] a = {6,3,4,7,2,8};
		hash(a);

	}

}
