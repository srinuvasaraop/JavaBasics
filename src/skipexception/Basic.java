package skipexception;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Basic {
	@Test
	public void test() {
		int a = 10;
		int b = 20;
		if (a > b) {
			System.out.println("step 6");
		} else {
			throw new SkipException("pre-requisites are not same");
		}
	}
}
