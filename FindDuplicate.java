/**Find duplicate Element
 * from  sorted array and Count duplicate value
 * for unsorted array better to use Hashing
 * @author hector
 *
 */
public class FindDuplicate {

	public static int duplicate(int d[],int m) {
		int i = 0;
		int j = 1;
		int last = 0;
		while(j<m) {
			
			if(d[i] == d[j] && last !=d[j]) {
				
				i++;
				last = d[i];
				System.out.print(d[j++]+",");
			}
			else {
				i++;
				j++;
			}
			
		}
		return 0;
	}
	
	public static void countDuplicate(int[]dup,int m) {
		
		int i=0;
		int j=1;
		int last=0;
		int count=0;
		while(j<m) {
			
			while(dup[i]  == dup[j]) {
				
				if(dup[i] == dup[j]) {
					j++;
				}
			}
			
			if(dup[i] !=dup[j]) {
				count = j-i;
				while(count > 1 && count !=last)  {
					System.out.print(count+",");
					last =count; 
				}
			}
			i++;
			j++;
			
		}
	}
	
	public static void main(String[] args) {
		
		int[] duplicate = {6,7,8,8,10,12,11,11,11,13,15,3,3,3,3,4,4,4,4,4,20};
//		int[] duplicate = {6,7,6,8,10,12,11};
		
//		System.out.println(duplicate(duplicate,duplicate.length));
		duplicate(duplicate,duplicate.length);
		System.out.println();
		countDuplicate(duplicate,duplicate.length);
		

	}

}
