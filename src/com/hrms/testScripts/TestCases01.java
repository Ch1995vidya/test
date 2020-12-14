package com.hrms.testScripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;
public class TestCases01 {
	@Test
	public void tc001() {
		//Test case steps
		DOMConfigurator.configure("log4j.xml");	//generating log File
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	
	}
}
