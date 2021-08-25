package varargs;

import org.testng.annotations.Test;

public class Addition {
	
	@Test
	public static int add(int...arr) {
		int sum=0;
		
		for(int a : arr) {
			sum = sum + a;
		}
		return sum;
	}	
}
