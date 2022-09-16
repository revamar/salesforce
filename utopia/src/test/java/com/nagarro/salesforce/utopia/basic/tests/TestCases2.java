package com.nagarro.salesforce.utopia.basic.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class TestCases2 {
	@Test
	public void test_case2_method1() {
		AssertJUnit.fail();
	}
	@Test
	public void test_case2_method2() {
		AssertJUnit.fail("This should be failed: explicit case");
	}

	@Test
	public void test_case2_method3() {
		AssertJUnit.assertEquals(false, false);
		
	}

	@Test
	public void test_case2_method4() {
		
		AssertJUnit.assertEquals(true, true);
		
	}
}
