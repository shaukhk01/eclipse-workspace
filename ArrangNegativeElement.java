//Arrange Negative leftside,and Positive rightside

public class ArrangNegativeElement {

	public static void move(int[] s,int m) {
		
		int i=1;
		int j=m-1;
		int temp=0;
		int onetime=1;
		while(i <j) {
			
			if(s[i]>0 && s[j]<0) {
				temp = s[i];
				s[i++] = s[j];
				s[j] = temp;
			}
				
			j--;
		}
		
		for(int k=0;k<s.length;k++,onetime++) {
			if(s[k] < 0 && s[onetime] > 0 ) {
				System.out.print("===>");
			}
			else
			System.out.print(s[k]+",");
	}
	}
	public static void main(String[] args) {
		
		int[] negative= {-3,7,10,6,-2,-1,-8,-4,-5,9,11,12};
		
		int m = negative.length;
		move(negative,m);

	}

}
