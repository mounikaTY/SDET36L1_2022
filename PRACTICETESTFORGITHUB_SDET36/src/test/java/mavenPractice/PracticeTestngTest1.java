package mavenPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTestngTest1 {
	
	@Test
	public void testngMethodTest() {
		
		Reporter.log("this is for github",true);
		
		//this is also a second change
	}
	
	@Test
	public void methodTestngTest2() {
		Reporter.log("This is for repository",true);
		
		//code is pushing to local repository
		
		String Browser = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println("browser is"+Browser+"====>"+URL);
	}

}
