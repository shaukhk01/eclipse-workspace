package AdtPractice;

public class ExampleQuickAlgo {

	
	public static int partition(int[]q,int l,int h) {
		
		int i = (l-1);
		int j = l;
		int pivot = q[h];
		int temp;
		
		while(j<h) {
			
			if(q[j] <=pivot) {
				i++;
				temp = q[i];
				q[i] = q[j];
				q[j] = temp;
			}
			j++;
		}
		return i;
	}
	public static void sort(int[]q,int l,int h) {
		
		if(l < h) {
			
			int pi = partition(q,l,h);
			sort(q,pi,h);
		}
		
	}
	public static void main(String[] args) {
		
		int[] quick = {50,70,60,90,40,80,10,20,30};

	}

}
