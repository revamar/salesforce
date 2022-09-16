package com.nagarro.salesforce.utopia.basic.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class TestCases1 {
	
	@Test
	public void test_case_method1() {
		AssertJUnit.fail();
	}
	@Test
	public void test_case_method2() {
		AssertJUnit.fail("This should be failed: explicit case");
	}

	@Test
	public void test_case_method3() {
		AssertJUnit.assertEquals(false, false);
		
	}

	@Test
	public void test_case_method4() {
		
		AssertJUnit.assertEquals(true, true);
		
	}

}
