package AdtPractice;

public class ExampleDuplicateElement {

	public static void duplicate(int[]a) {
		
		int count,last=0;
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j] !=-1) {
				if(a[i]==a[j] && last !=a[j]) {
					count++;
					a[j] = -1;
					last = a[j];
				}
				if(count>0 && a[j]==-1) {
					System.out.println("duplicate:"+a[i]);
				}
			}
			}
		}
	}
	public static void main(String[] args) {

		int[] arr = {8,2,6,4,6,5,8,2,7};
		
		duplicate(arr);
	}

}
