//validate char[] array.

public class ValidateUserName {

	public static boolean validate(char[]v,int n) {
		
		for(int i=0;i<n;i++) {
			
			if(!(v[i]>=65 && v[i]<=90) && !(v[i]>=97 && v[i]<=122) && !(v[i]>=48 && v[i]<=58)) {
			  
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {

//		char[]v = {'a','n','n','i','e',1,0};
		char[]v = {'a','n','n','i','e'};
		boolean validate = validate(v,v.length);
		if(validate !=false) {
			System.out.println(validate);
		}
		else
			System.out.println(validate);
		}
			
	}
