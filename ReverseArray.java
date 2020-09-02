
public class ReverseArray {
	 int[] sw = {2,4,6,8,10,12,14,16};
	static int[]SW = new int[8];
	public void swapreverse() {
		int temp=0;
		int l = sw.length-1;
		for(int i=0;i<sw.length;i++) {
			temp = sw[i];
			SW[i] = sw[l];
			SW[l--] = temp;
			
		}
		for(int i=0;i<sw.length;i++) 
			sw[i] = SW[i];
	}
/*	public static void print() {
		
		for(int i=0;i<sw.length;i++)
			System.out.print(sw[i]+" ");
	}
	*/

	public static void main(String[] args) {
		
		ReverseArray ra = new ReverseArray();

		ra.swapreverse();
		for(int i=0;i<ra.sw.length;i++)
			System.out.print(ra.sw[i]+",");
	//	print();
		
	}

}
