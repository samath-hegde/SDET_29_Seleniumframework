package com.crm.ContactTest;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups = "regression test")
	 public void createContactTest() {
		System.out.println("execute create contact test");
	}
	@Test
	 public void modifyContactTest() {
		System.out.println("execute modify contact test");
}
}
