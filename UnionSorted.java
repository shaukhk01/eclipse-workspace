
public class UnionSorted {

	public static void unionSorted(int[]a,int[]b,int m,int n) {
		
		int[] c = new int[m+n];
		int k=0;
		int i=0;
		int j=0;
		 while(j<n) {
			if(a[i] == b[j]) {
				c[k++] = b[j];
				i++;
				j++;
			}
				
			if(a[i]<b[j]) {
				c[k++] = a[i];
			}
			else
				c[k++] = b[j++];
		}
		 for(;i<m;i++)
			 c[k++] = a[i];
		 
		 for(int x=0;x<c.length;x++) {
			 if(c[x] !=0)
			 System.out.print(c[x]+",");
		 }
	}
	public static void main(String[] args) {
		
		int[] A= {3,5,7,8,9,10,11};
		int[] B= {1,2,3,4,5,6};
		int m= A.length;
		int n = B.length;
		unionSorted(A,B,m,n);

	}

}
