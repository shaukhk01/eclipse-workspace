
public class Union {

	static int[] c = new int[10];
	public static void union(int[]a,int[]b,int m,int n) {
		
		int k=0;
		int j=0;
		int flag = 0;
		int move=0;
		for(int i=0;i<m;i++)
			c[k++] = a[i];
		
		while(j<n) {
			
			for(int i=0;i<c.length;i++) {
				
			//we can use this logic also in intersection.	
			if(b[j] ==c[i]) {
				flag++; 
				System.out.println("intersection: "+b[j]);
				j++;
				break;
			}
			
/******************
 * Difference:
				  *else if(b[j] !=c[i]) {
				  *	move++;
				  *	}
				  *}
				  *if(move !=0)
				  *	System.out.print("difference: "+b[j]);
*******************/
			}
	    if(flag ==0)
	    	c[k++] = b[j++];
	    else 
	    	flag = 0;
		}
	}
		
	public static void main(String[] args) {
		int[] UI = {3,5,10,4,6};
		int[] UII = {12,4,7,10,5};
		int m = UI.length;
		int n = UII.length;
		
		union(UI,UII,m,n);
		
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+",");

	}

}
