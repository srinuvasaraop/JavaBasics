package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_assertion {
	@Test(enabled=false)
	public void Test() 
	{
		String name = "srinivas";
		String name1 = "srinivas";
		Assert.assertEquals(name, name1, "same strings ");
		System.out.println("step 5");
		System.out.println("step 6");
		System.out.println("step 7");
		System.out.println("step 8");
	}
	@Test(enabled=false)
	public void Test1() {
		String name = "srinivas";
		String name1 = "srinivasnaidu";
		Assert.assertEquals(name, name1, "not same strings ");
		System.out.println("step 5");
		System.out.println("step 6");
		System.out.println("step 7");
		System.out.println("step 8");
	}
	@Test(enabled=false)
	public void Test3() {
		String name = "srinivas";
		String name1 = "srinivasnaidu";
		Assert.assertNotEquals(name, name1, "not same strings ");
		System.out.println("step 5");
		System.out.println("step 6");
		System.out.println("step 7");
		System.out.println("step 8");
	}
	@Test(enabled=false)
	public void Test4() {
		String name = "srinivas";
		String name1 = "srinivas";
		Assert.assertNotEquals(name, name1, "not same strings ");
		System.out.println("step 5");
		System.out.println("step 6");
		System.out.println("step 7");
		System.out.println("step 8");
	}
	@Test(enabled=false)
	public void Test5()
	{
		boolean condition=true;
		Assert.assertTrue(condition,"not same");
		System.out.println("step 5");
		System.out.println("step 6");
		System.out.println("step 7");
		System.out.println("step 8");
	}
	@Test(enabled=false)
	public void Test6()
	{
		boolean condition=false;
		Assert.assertTrue(condition,"not same");
		System.out.println("step 5");
		System.out.println("step 6");
		System.out.println("step 7");
		System.out.println("step 8");
	}
	@Test(enabled=false)
	public void Test7()
	{
		boolean condition=false;
		Assert.assertFalse(condition," same");
		System.out.println("step 5");
		System.out.println("step 6");
		System.out.println("step 7");
		System.out.println("step 8");
	}
	@Test(enabled=false)
	public void Test8()
	{
		boolean condition=true;
		Assert.assertFalse(condition,"not same");
		System.out.println("step 5");
		System.out.println("step 6");
		System.out.println("step 7");
		System.out.println("step 8");
	}
	@Test(enabled=false)
	public void Test9()
	{
		String strr=null;
		Assert.assertNull(strr, "same");
		System.out.println("step 5");
		System.out.println("step 6");
		System.out.println("step 7");
		System.out.println("step 8");
	}
	@Test
	public void Test10()
	{
		String strr=null;
		Assert.assertNotNull(strr, "not same");
		System.out.println("step 5");
		System.out.println("step 6");
		System.out.println("step 7");
		System.out.println("step 8");
	}
	
}
