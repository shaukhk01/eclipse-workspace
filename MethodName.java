import java.lang.reflect.*;
public class MethodName {

	public static void main(String[] args)throws Exception {
		
		Class c = Class.forName("java.util.BufferedReader");
		
		Method[] m = c.getDeclaredMethods();
		for(String s1:s)
			System.out.println(s1.getName());
	}
}
