package testNGAssertion;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAndHardAssert {
	
	
	@Test
	public void test1method(){
		
		SoftAssert soft = new SoftAssert();
		
		System.out.println("SYSO 1");
		Assert.assertEquals(true, true);
		
		System.out.println("SYSO 2");
		System.out.println("SYSO 3");
		Assert.assertEquals(true, true);
		
		System.out.println("SYSO 4");
		System.out.println("SYSO 5");
		soft.assertEquals(true, false);
		
		System.out.println("SYSO 6");
		soft.assertEquals(true, false);
		System.out.println("SYSO 7");
		
		soft.assertAll(); 
	}
	
	@Test
	public void test2method(){
		
		SoftAssert soft = new SoftAssert();
		
		System.out.println("Text -1");
		Assert.assertEquals(true, true);
		
		System.out.println("Text -2");
		soft.assertEquals(true, false);
		
		System.out.println("Text -3");
		
		soft.assertAll(); 
	}
	
	/*@AfterClass
	public void tearDown(){
		soft.assertAll(); 
	}
	*/

}
